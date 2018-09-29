class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    class Node {
        private String value;
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
    public String pop() {
        if (tail != null) {
       Node temp = head;
       while(temp.next.next != null) {

            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    return null;
    }
public void push(String value) {
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
     //Function to print linked list 
    // void printlist() 
    // { 
    //     while (head != null) 
    //     { 
    //         System.out.print(head.value); 
    //         head = head.next; 
    //     } 
    // }
    public String displayAll() {
        if(size!=0) {
            String s = "";
            Node temp = head;
            while(temp!=null){
                s += temp.value;
                temp = temp.next;
            }
            return s;
        }
        return null;
    }
}

