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
    public void pop() {
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
    // public void push(final String value) {
    //     if(head == null) {
    //     //Node oldHead = head;
    //     head = new Node();
    //     head.value = value;
    //     head.next = null;
    //     tail = head;
    // } else {
    //     Node oldHead = head;
    //     head = new Node();
    //     head.value = value;
    //     head.next = oldHead;
    // }
    // size++;
    // }
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
    void printlist() 
    { 
        while (head != null) 
        { 
            System.out.print(head.value); 
            head = head.next; 
        } 
    }
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


// public class linkedlistATN 
// { 
//     class node 
//     { 
//         int val; 
//         node next; 

//         public node(int val) 
//         { 
//             this.val = val; 
//         } 
//     }
    
//     // Function to print linked list 
//     void printlist(node head) 
//     { 
//         while (head != null) 
//         { 
//             System.out.print(head.val); 
//             head = head.next; 
//         } 
//     } 

//     node head1, head2, result; 
//     int carry; 

//     /* A utility function to push a value to linked list */
//     void push(int val, int list) 
//     { 
//         node newnode = new node(val); 
//         if (list == 1) 
//         { 
//             newnode.next = head1; 
//             head1 = newnode; 
//         } 
//         else if (list == 2) 
//         { 
//             newnode.next = head2; 
//             head2 = newnode; 
//         } 
//         else
//         { 
//             newnode.next = result; 
//             result = newnode; 
//         } 

//     }

//     // Adds two linked lists of same size represented by 
//     // head1 and head2 and returns head of the resultant 
//     // linked list. Carry is propagated while returning 
//     // from the recursion 
//     void addsamesize(node n, node m) 
//     { 
//         // Since the function assumes linked lists are of 
//         // same size, check any of the two head pointers 
//         if (n == null) 
//             return; 

//         // Recursively add remaining nodes and get the carry 
//         addsamesize(n.next, m.next); 

//         // add digits of current nodes and propagated carry 
//         int sum = n.val + m.val + carry; 
//         carry = sum / 10; 
//         sum = sum % 10; 

//         // Push this to result list 
//         push(sum, 3); 

//     } 

//     node cur; 

//     // This function is called after the smaller list is 
//     // added to the bigger lists's sublist of same size. 
//     // Once the right sublist is added, the carry must be 
//     // added to the left side of larger list to get the 
//     // final result. 
//     void propogatecarry(node head1) 
//     { 
//         // If diff. number of nodes are not traversed, add carry 
//         if (head1 != cur) 
//         { 
//             propogatecarry(head1.next); 
//             int sum = carry + head1.val; 
//             carry = sum / 10; 
//             sum %= 10; 

//             // add this node to the front of the result 
//             push(sum, 3); 
//         } 
//     } 

//     int getsize(node head) 
//     { 
//         int count = 0; 
//         while (head != null) 
//         { 
//             count++; 
//             head = head.next; 
//         } 
//         return count; 
//     } 

//     // The main function that adds two linked lists 
//     // represented by head1 and head2. The sum of two 
//     // lists is stored in a list referred by result 
//     void addlists() 
//     { 
//         // first list is empty 
//         if (head1 == null) 
//         { 
//             result = head2; 
//             return; 
//         } 

//         // first list is empty 
//         if (head2 == null) 
//         { 
//             result = head1; 
//             return; 
//         } 

//         int size1 = getsize(head1); 
//         int size2 = getsize(head2); 

//         // Add same size lists 
//         if (size1 == size2) 
//         { 
//             addsamesize(head1, head2); 
//         } 
//         else
//         { 
//             // First list should always be larger than second list. 
//             // If not, swap pointers 
//             if (size1 < size2) 
//             { 
//                 node temp = head1; 
//                 head1 = head2; 
//                 head2 = temp; 
//             } 
//             int diff = Math.abs(size1 - size2); 

//             // move diff. number of nodes in first list 
//             node temp = head1; 
//             while (diff-- >= 0) 
//             { 
//                 cur = temp; 
//                 temp = temp.next; 
//             } 

//             // get addition of same size lists 
//             addsamesize(cur, head2); 

//             // get addition of remaining first list and carry 
//             propogatecarry(head1); 
//         } 
//             // if some carry is still there, add a new node to 
//             // the front of the result list. e.g. 999 and 87 
//             if (carry > 0) 
//                 push(carry, 3); 
        
//     }