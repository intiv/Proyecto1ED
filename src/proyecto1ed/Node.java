package proyecto1ed;

public class Node {
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
