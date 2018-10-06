import java.util.Scanner;
class Solution {
	private Solution() { }
	public static void mertiList(Student[] a, int vacancy, int open, int bc, int sc, int st) {
        for (int i = 0; i < a.length && vacancy > 0; i++) {
            if (open > 0) {
                // System.out.println(a[i].studentName + "," +
                //                    a[i].totalMarks + "," +
                //                    a[i].reservationCat);
                System.out.println(a[i].toString());
                open--;
            } else if (a[i].reservationCat.equals("BC") || a[i].reservationCat.equals("SC") || a[i].reservationCat.equals("ST")) {
                if (a[i].reservationCat.equals("BC") && bc > 0) {
                    // System.out.println(a[i].studentName + "," +
                    //                    a[i].totalMarks + "," +
                    //                    a[i].reservationCat);
                    System.out.println(a[i].toString());
                    bc--;
                } else if (a[i].reservationCat.equals("SC") && sc > 0) {
                    // System.out.println(a[i].studentName + "," +
                    //                    a[i].totalMarks + "," +
                    //                    a[i].reservationCat);
                    System.out.println(a[i].toString());
                    sc--;
                } else if (a[i].reservationCat.equals("ST") && st > 0) {
                    // System.out.println(a[i].studentName + "," +
                    //                    a[i].totalMarks + "," +
                    //                    a[i].reservationCat);
                    System.out.println(a[i].toString());
                    st--;
                } else {
                }
            }
        }
        vacancy--;
    }
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int size = 0;
			int n= s.nextInt();
			// System.out.println(n);
			int n1 = s.nextInt();
			// System.out.println(n1);
			int n2 = s.nextInt();
			// System.out.println(n2);
			int n3 = s.nextInt();
			// System.out.println(n3);
			int n4 = s.nextInt();
			// System.out.println(n4);
			int n5 = s.nextInt();
			// System.out.println(n5);
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
			System.out.println();
			mertiList(students, n1, n2, n3, n4, n5);
		}
	}