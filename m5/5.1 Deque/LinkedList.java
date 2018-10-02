final class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    class Node {

        private int value;
        private Node next;

    }

    LinkedList() {
        head = tail;
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void erasefront() {
        if (head!=null) {
        head = head.next;
        size--;
    }
    }
    public void eraseback() {
        if (tail != null) {
       Node temp = head;
       while(temp.next.next != null) {

            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    }

    public void Insertfront(final int value) {
        if(head == null) {
        //Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = null;
        tail = head;
    } else {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
    size++;
    }
public void Insertback(final int value) {
        if(tail == null) {
        //Node temp = tail;
            tail = new Node();
            tail.value = value;
            tail.next = null;
        //temp.next = tail;
            head = tail;
        }   else {
            Node temp = tail;
            tail = new Node();
            tail.value = value;
            tail.next = null;
            temp.next = tail;
        }
        size++;
    }
    public int getsize() {
        return size;
    }
}