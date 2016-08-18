/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1ed;

public abstract class ADTList {
    protected class Node{
        protected Node next,prev;
        
        Node(){
            next=prev=null;
            
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
    }
    
    protected int size;
    protected Node head;
    
    ADTList(){
        head=null;
        size=0;
    }
    
    public int length(){
        return size;
    }
}
