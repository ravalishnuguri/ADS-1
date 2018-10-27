
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      m1    The m 1
     * @param      m2    The m 2
     */
    public static void put(Student[] a,int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].getRollno() == x) {
                System.out.println(a[i].getName());
            }
        }
}
/**
 * { function_description }
 *
 * @param      a     { parameter_description }
 * @param      m1    The m 1
 */
public static void put1(Student[] a, int x) {
    for (int i = 0; i < a.length; i++) {
            if (a[i].getRollno()== x) {
                System.out.println(a[i].getMarks());
            }
        }
}
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        // BST<String, Integer> bst = new BST<String, Integer>();
        Selection t = new Selection();
        int num = sc.nextInt();
        Student[] students = new Student[num];
        sc.nextLine();
        for(int i = 0; i < num; i++) {
            String[] tokens = sc.nextLine().split(",");
            // bst.put(new Student(tokens[0], tokens[1], tokens[2]), i);
            students[size++] = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
        }
        t.Sort(students, size);
        int no = sc.nextInt();
        sc.nextLine();
            for(int j = 0; j< no ; j++) {
                String[] tok = sc.nextLine().split(" ");
                if (Integer.parseInt(tok[2]) == 1) {
                    put(students, Integer.parseInt(tok[1]));
                } else {
                    put1(students, Integer.parseInt(tok[1]));
                }
        }
}
}
