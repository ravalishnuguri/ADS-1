import java.util.Scanner;
import java.util.HashMap;
/**.
Solution class
*/
final class Solution {
/**.
@Solution() the constructor
*/
private Solution() {

}
/**
@param args the command line arguments
*/
public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int m = scan.nextInt();
    int n = scan.nextInt();
    scan.nextLine();
    String[] magazine = scan.nextLine().split(" ");
    String[] note = scan.nextLine().split(" ");
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    for (int i = 0; i < m; i++) {
        if (hm.containsKey(magazine[i])) {
            hm.put(magazine[i], hm.get(magazine[i]) + 1);
        } else {
            hm.put(magazine[i], 1);
        }
    }
    boolean check = false;
    for (int i = 0; i < n; i++) {
        if (!hm.containsKey(note[i])) {
            check = true;
        } else {
            if (hm.get(note[i]) > 1) {
                hm.put(note[i], hm.get(note[i]) - 1);
            } else {
                hm.remove(note[i]);
            }
        }
    }
    if (!check) {
        System.out.println("");
    } else {
    System.out.println("No");
        }
    }
}
