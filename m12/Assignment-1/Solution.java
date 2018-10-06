import java.util.Scanner;
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
	 * @param      a        { parameter_description }
	 * @param      vacancy  The vacancy
	 * @param      open     The open
	 * @param      bc       { parameter_description }
	 * @param      sc       The screen
	 * @param      st       { parameter_description }
	 */
	public static void mertiList(final Student[] a, int vacancy, int open, int bc, int sc, int st) {
        for (int i = 0; i < a.length && vacancy > 0; i++) {
            if (open > 0) {
                System.out.println(a[i].toString());
                open--;
            } else if (a[i].reservationCat.equals("BC") || a[i].reservationCat.equals("SC") || a[i].reservationCat.equals("ST")) {
                if (a[i].reservationCat.equals("BC") && bc > 0) {
                    System.out.println(a[i].toString());
                    bc--;
                } else if (a[i].reservationCat.equals("SC") && sc > 0) {
                    System.out.println(a[i].toString());
                    sc--;
                } else if (a[i].reservationCat.equals("ST") && st > 0) {
                    System.out.println(a[i].toString());
                    st--;
                } else {
                }
            }
        }
        vacancy--;
    }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
		public static void main(final String[] args) {
			try {
				Scanner s = new Scanner(System.in);
			int size = 0;
			final int num = 3;
			int n = s.nextInt();
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int n3 = s.nextInt();
			int n4 = s.nextInt();
			int n5 = s.nextInt();
			Student[] students = new Student[n+1];
			Selection t = new Selection();
			s.nextLine();
			while(s.hasNext()) {
				String[] line = s.nextLine().split(",");
				students[size++] = new Student(line[0], line[1],
					Integer.parseInt(line[2]), Integer.parseInt(line[2 + 1]),
					Integer.parseInt(line[2 + 2]), Integer.parseInt(line[2 + num]),
					line[num + num]);
			}
			System.out.println(t.Meritorder(students, size));
			System.out.println();
			mertiList(students, n1, n2, n3, n4, n5);
			} catch (java.lang.NullPointerException exception) {
				System.out.println("");
			}
		}
	}