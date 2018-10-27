
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
    public static void between(Student[] a,Double m1, Double m2) {
        // Selection t = new Selection();
        // t.Sort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i].getMarks() >= m1 && a[i].getMarks() <= m2) {
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
public static void less(Student[] a, Double m1) {
    for (int i = 0; i < a.length; i++) {
        if (a[i].getMarks() <= m1) {
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
public static void great(Student[] a, Double m1) {
    for (int i = 0; i< a.length; i++) {
        if (a[i].getMarks() >= m1) {
            System.out.println(a[i].getName());
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
                switch (tok[0]) {
                    case "BE":
                    between(students, Double.parseDouble(tok[1]), Double.parseDouble(tok[2]));
                    break;
                    case "LE":
                    less(students, Double.parseDouble(tok[1]));
                    break;
                    case "GE":
                    great(students, Double.parseDouble(tok[1]));
                    break;
                    default:
                    break;                    
                }
            }
        }
}
