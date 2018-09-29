import java.util.*;
class split {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr1 = new String[100];
		arr1 = s.nextLine().split("");
		System.out.println(Arrays.toString(arr1));
	}
}