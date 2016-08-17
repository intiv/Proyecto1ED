package proyecto1ed;

public class LinkedList extends ADTList{

    private class Node extends ADTList.Node{
        private Student data;
        
        Node(){
            super();
            next=prev=null;
        }
        
        Node(Student data){
            this.data=data;
            next=prev=null;
        }
        
        Node(Student data, Node next, Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
        
        public Student getData(){
            return data;
        }
        
        public void setData(Student data){
            this.data=data;
        }
        
        
        @Override
        public String toString(){
            return data.toString();
        }
    }
    
    LinkedList() {
        head = null;
        size = 0;
    }

    public int indexOf(Student data) {
        if (data == null||size==0) {
            return -1;
        }
        Node tmp = (Node) head;
        if (tmp.getData() == data) {
            return 0;
        } else {
            int index = 1;
            while ((tmp = (Node) tmp.getNext()) != null) {
                if (tmp.getData() == data) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public Student get(int ind) {
        if (ind < 0 || ind >= size) {
            return null;
        }
        Node tmp = (Node) head;
        for (int i = 0; i < ind; i++) {
            tmp = (Node) tmp.getNext();
        }
        return tmp.getData();
    }

    public boolean insert(Student data,int ind){
        if(ind<0||ind>size)
            return false;
        if(indexOf(data)!=-1)
            return false;
        Node nouveau=new Node(data);
        if(head==null)
            head=nouveau;
        else{
            if(ind==0){
                head.setPrev(nouveau);
                nouveau.setNext(head);
                head=nouveau;
            }else if(ind>0&&ind<size){
                Node tmp=(Node) head;
                for(int i=1;i<ind;i++)
                    tmp=(Node) tmp.getNext();
                nouveau.setPrev(tmp);
                nouveau.setNext(tmp.getNext());
                tmp.getNext().setPrev(nouveau);
                tmp.setNext(nouveau);
            }else{
                Node tmp=(Node) head;
                for (int i = 1; i < ind; i++)
                    tmp=(Node) tmp.getNext();
                tmp.setNext(nouveau);
                nouveau.setPrev(tmp);
            }
        }
        size++;
        return true;
    }
    
    public boolean remove(int ind){
        if(ind<0||ind>=size){
            return false;
        }
        Node tmp;
        if(ind==0){
            if(size>1){
                tmp=(Node) head.getNext();
                tmp.setPrev(null);
                head.setNext(null);
                head=tmp;
            }else{
                head.setNext(null);
                head=null;
            }
        }else if(ind==size-1){
            tmp=(Node) head;
            for(int i=0;i<ind-1;i++)
                tmp=(Node) tmp.getNext();
            Node delVal=(Node) tmp.getNext();
            tmp.setNext(null);
            delVal.setPrev(null);
        }else{
            tmp=(Node) head;
            for(int i=0;i<ind-1;i++)
                tmp=(Node) tmp.getNext();
            Node delVal=(Node) tmp.getNext();
            tmp.setNext(delVal.getNext());
            delVal.getNext().setPrev(tmp);
            delVal.setNext(null);
            delVal.setPrev(null);
        }
        size--;
        return true;
    }
}
