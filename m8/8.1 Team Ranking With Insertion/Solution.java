import java.util.Scanner;
import java.util.Arrays;
class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Insertion in = new Insertion();
		while (s.hasNext()) {
			String line = s.nextLine();
        	String[] tokens = line.split(",");
        	in.add(new Teamdetails(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3])));
		}
		in.insertionsort();
		System.out.println(in);
	}
}


 // public static void main(final String[] args) {
 //        Scanner scan = new Scanner(System.in);
 //        InsertionSort isobj = new InsertionSort();
 //        while (scan.hasNext()) {
 //            String[] tokens = scan.nextLine().split(",");
 //            isobj.add(new Tournament(tokens[0], Integer.parseInt(tokens[1]),
 //            Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1])));
 //        }
 //        isobj.insertionsort();
 //        System.out.println(isobj);
 //    }