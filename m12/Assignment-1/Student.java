public class Student implements Comparable<Student> {
	private String name;
	private String date;
	private int marks1;
	private int marks2;
	private int marks3;
	private int totmarks;
	public String reservationCat;
	private int day;
	private int month;
	private int year;
	Student() { }
	Student(String name1, String date1, int m1, int m2, int m3, int totalmarks, String category1) {
		this.name = name1;
		this.date = date1;
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		this.totmarks = totalmarks;
		this.reservationCat = category1;
	}
	public String toString() {
        String n = "";
        n = this.name + "," + this.totmarks + "," + this.reservationCat;
        return n;
    }
    // public String toString1() {
    // 	String x = "";
    // 	x = this.category;
    // 	return x;
    // }
	public String getName() {
		return this.name;
	}
	public String getDate() {
		// return this.date;
		String[] d = this.date.split("-");
		this.day = Integer.parseInt(d[0]);
		this.month = Integer.parseInt(d[1]);
		this.year = Integer.parseInt(d[2]);
		return this.date;

	}
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	// public Boolean bigdate(Student that) {

	// 	return false;
	// }
	public int getMarks1() {
		return this.marks1;
	}
	public int getMarks2() {
		return this.marks2;
	}
	public int getMarks3() {
		return this.marks3;
	}
	public int getTotmarks() {
		return this.totmarks;
	}
	public String getCategory() {
		return this.reservationCat;
	}
	public int compareTo(Student that) {
		if (this.getTotmarks() > that.getTotmarks()) {
            return 1;
        } else if (this.getTotmarks() < that.getTotmarks()) {
            return -1;
        } else if (this.getMarks3() > that.getMarks3()) {
            return 1;
        } else if (this.getMarks3() < that.getMarks3()) {
            return -1;
        } else if (this.getMarks2() > that.getMarks2()) {
            return 1;
        } else if (this.getMarks2() < that.getMarks2()) {
            return -1;
         } else if (this.getYear() > that.getYear()) {
         	return 1;
         } else if (this.getYear() < that.getYear()) {
         	return -1;
         } else if (this.getMonth() > that.getMonth()) {
         	return 1;
         } else if (this.getMonth() < that.getMonth()) {
         	return -1;
         } else if (this.getDay() > that.getDay()) {
         	return 1;
         } else if (this.getDay() < that.getDay()) {
         	return -1;
         } else {
            return 0;
        }
	}
}