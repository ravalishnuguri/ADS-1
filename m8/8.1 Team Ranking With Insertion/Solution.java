import java.util.Scanner;
import java.util.Arrays;
class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] str = new String[7];
		int i = 0;
		while(s.hasNextLine()) {
			str[i] = s.nextLine();
			i++;
		}
		System.out.println(Arrays.toString(str));
	}
}
