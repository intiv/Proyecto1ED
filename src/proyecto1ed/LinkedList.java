package proyecto1ed;

public class LinkedList {

    private int size;
    private Node head;

    LinkedList() {
        head = null;
        size = 0;
    }

    public Node first() {
        return head;
    }

    public Node last() {
        Node tmp = head;
        if (tmp == null) {
            return null;
        } else {
            while ((tmp = tmp.getNext()) != null) {
            }
            return tmp;
        }
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

    
}
