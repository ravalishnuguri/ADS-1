import java.util.Scanner;
class Solution {
	private Solution() { }
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int size = 0;
			int n= s.nextInt();
			System.out.println(n);
			int n1 = s.nextInt();
			System.out.println(n1);
			int n2 = s.nextInt();
			System.out.println(n2);
			int n3 = s.nextInt();
			System.out.println(n3);
			int n4 = s.nextInt();
			System.out.println(n4);
			int n5 = s.nextInt();
			System.out.println(n5);
			Student[] students = new Student[n+1];
			Selection t = new Selection();
			s.nextLine();
			while(s.hasNext()) {
				String[] line = s.nextLine().split(",");
				students[size++] = new Student(line[0], line[1],
					Integer.parseInt(line[2]), Integer.parseInt(line[3]),
					Integer.parseInt(line[4]), Integer.parseInt(line[5]),
					line[6]);
			}
			System.out.println(t.Meritorder(students, size));
		}
	}