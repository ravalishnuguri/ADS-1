import java.util.Scanner;
/**
 * class for Solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinearProbing<String, Integer> object = new LinearProbing<String,
        Integer>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
                case "put":
                    object.put(tokens[1], Integer.parseInt(tokens[2]));
                    break;
                case "ge":
                    System.out.println(object.get(tokens[1]));
                    break;
                case "delee":
                    object.delete(tokens[1]);
                    break;
                case "display":
                    object.display();
                    break;
                default:
                break;
            }
        }
    }
}
