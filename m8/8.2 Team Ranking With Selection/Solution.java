import java.util.Scanner;
public final class Solution {
    private static final int TEN = 10;
    private static final int THREE = 3;
    private Solution() {

    }
    public static void main(final String[] args) {
        Teamdetails[] teams = new Teamdetails[TEN];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Selection t = new Selection();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            teams[size++] = new Teamdetails(line[0], Integer.parseInt(line[1]),
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]));
        }
        System.out.println(t.leaderboard(teams, size));
    }
}