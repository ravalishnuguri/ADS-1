import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] s = new String[num];
		for (int i =0;i<num;i++) {
			s[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(s));
	}
}