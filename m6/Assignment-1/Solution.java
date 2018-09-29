import java.util.Scanner;
/**
 * Class for add large numbers.
 */
class AddLargeNumbers {
    /**
     * Constructs the object.
     */
   // private addLargeNumbers() { }
   /**
    * function_description.
    *
    * @param      number  The number
    *
    * @return     { description_of_the_return_value }
    */
    public static LinkedList numberToDigits(final String number) {
        LinkedList nm = new LinkedList();
        int size = number.length();
        String[] arr = new String[size];
        arr = number.split("");
        for(int i = 0; i < size; i++) {
            nm.push(arr[i]);
        }
        return nm;
    }
    /**
     * function_description.
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */
    public static String digitsToNumber(final LinkedList list) {
        return list.displayAll();
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2) {
        // LinkedList result = new LinkedList();
        // int size1 = list1.getsize();
        // int m = 0;
        // int n = 0;
        // String[] a1 = new String[size1];
        // int size2 = list2.getsize();
        // String[] a2 = new String[size2];
        // int[] a3 = new int[size1];
        // while(!list1.isEmpty()) {
        //     a1[m] = list1.pop();
        //     m++;
        // }
        // while(!list2.isEmpty()) {
        //     a2[n] = list2.pop();
        //     n++;
        // }
        // for (int k = 0; k<size1;k++) {
        //     a3[k] = Integer.parseInt(a1[k]) + Integer.parseInt(a2[k]);
        // }
        // for(int z = 0;z < a3.length;z++) {
        //     result.push(Integer.toString(a3[z]));
        // }
        // return result;
        return list2;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
                default:
                break;
        }
    }
    
}

    

