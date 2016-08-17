package proyecto1ed;

public class Grades extends ADTList{
    private class Node extends ADTList.Node{
        private double grade;
        
        Node(){
            grade=0;
            next=prev=null;
        }
        
        Node(double grade){
            this.grade=grade;
            next=prev=null;
        }
        
        Node(double grade, Node next, Node prev){
            this.grade=grade;
            this.next=next;
            this.prev=prev;
        }
        
        public double getGrade(){
            return grade;
        }
        
        public void setGrade(double grade){
            this.grade=grade;
        }
    }

    Grades() {
        head = null;
        size = 0;
    }

    public double get(int ind) {
        if (ind < 0 || ind >= size) {
            return 0;
        }
        Node tmp = (Node) head;
        for (int i = 0; i < ind; i++) {
            tmp = (Node) tmp.getNext();
        }
        return tmp.getGrade();
    }

    public void reset() {
        if (size > 0) {
            Node tmp = (Node) head;
            for (int i = 1; i < size; i++) {
                tmp = (Node) tmp.getNext();
                tmp.setGrade(0);
                tmp.setPrev(null);
            }
            tmp.setNext(null);
            head = null;
        }else{
            head=null;
        }
        size=0;
    }
    
    public boolean insert(double grade,int ind){
        if(ind<0||ind>size)
            return false;
        Node nouveau=new Node(grade);
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
