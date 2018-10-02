import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
class Solution {
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
		Scanner s = new Scanner(System.in);
		Insertion in = new Insertion();
		while (s.hasNext()) {
			String line = s.nextLine();
        	String[] tokens = line.split(",");
        	in.add(new Teamdetails(tokens[0], Integer.parseInt(tokens[1]),
        		Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1])));
		}
		in.insertionsort();
		System.out.println(in);
	}
}
