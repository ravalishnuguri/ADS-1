import java.util.Scanner;
/**
 * item_description.
 */
public final class Solution {
    /**
     * var_description.
     */
    private static final int TEN = 10;
    /**
     * var_description.
     */
    private static final int THREE = 3;
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Team[] teams = new Team[TEN];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Selection t = new Selection();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            teams[size++] = new Team(line[0], Integer.parseInt(line[1]),
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]));
        }
        System.out.println(t.leaderboard(teams, size));
    }
}
