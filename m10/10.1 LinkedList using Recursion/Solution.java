import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(sc.hasNextLine()){
            String[] values = sc.nextLine().split(" ");
            switch (values[0]) {
                case "insertAt":
                try{
                    ll.insertAt(Integer.parseInt(values[1]), new Node(values[2]));
                ll.display();
                }

                catch (Exception e) {
                    System.out.println("Can't insert at this position.");

                }
                break;
                case "reverse":
                try{
                    ll.reverse();
                ll.display();
                }

                catch(Exception e){
                    System.out.println("No elements to reverse.");
                }
                break;

            }
        }
    }
}
class Node {
    String data;
    Node next;
    Node(String val){
        data = val;
    }
}