package proyecto1ed;

public class LinkedList {

    private class Node{
        private Student data;
        private Node next,prev;
        
        Node(){
            data=null;
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
        
        public Node getNext(){
            return next;
        }
        
        public Node getPrev(){
            return prev;
        }
        
        public void setNext(Node next){
            this.next=next;
        }
        
        public void setPrev(Node prev){
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
    
    private int size;
    private Node head;

    LinkedList() {
        head = null;
        size = 0;
    }

    public int length(){
        return size;
    }
    
    public int indexOf(Student data) {
        if (data == null) {
            return -1;
        }
        Node tmp = head;
        if (tmp.getData() == data) {
            return 0;
        } else {
            int index = 1;
            while ((tmp = tmp.getNext()) != null) {
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
        Node tmp = head;
        for (int i = 0; i < ind; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getData();
    }

    public void reset() {
        if (size > 0) {
            Node tmp = head;
            for (int i = 1; i < size; i++) {
                tmp = tmp.getNext();
                tmp.setData(null);
                tmp.setPrev(null);
            }
            tmp.setNext(null);
            head = null;
        }else{
            head=null;
        }
        size=0;
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
                Node tmp=head;
                for(int i=1;i<ind;i++)
                    tmp=tmp.getNext();
                nouveau.setPrev(tmp);
                nouveau.setNext(tmp.getNext());
                tmp.getNext().setPrev(nouveau);
                tmp.setNext(nouveau);
            }else{
                Node tmp=head;
                for (int i = 1; i < ind; i++)
                    tmp=tmp.getNext();
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
                tmp=head.getNext();
                tmp.setPrev(null);
                head.setNext(null);
                head=tmp;
            }else{
                head.setNext(null);
                head=null;
            }
        }else if(ind==size-1){
            tmp=head;
            for(int i=0;i<ind-1;i++)
                tmp=tmp.getNext();
            Node delVal=tmp.getNext();
            tmp.setNext(null);
            delVal.setPrev(null);
        }else{
            tmp=head;
            for(int i=0;i<ind-1;i++)
                tmp=tmp.getNext();
            Node delVal=tmp.getNext();
            tmp.setNext(delVal.getNext());
            delVal.getNext().setPrev(tmp);
            delVal.setNext(null);
            delVal.setPrev(null);
        }
        size--;
        return true;
    }
}
