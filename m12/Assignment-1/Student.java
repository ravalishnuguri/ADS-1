/**
 * Class for student.
 */
public class Student implements Comparable<Student> {
    /**
     * { var_description.
     */
    private String name;
    /**
     * { var_description.
     */
    private String date;
    /**
     * { var_description.
     */
    private int marks1;
    /**
     * { var_description.
     */
    private int marks2;
    /**
     * { var_description.
     */
    private int marks3;
    /**
     * { var_description.
     */
    private int totmarks;
    /**
     * { var_description.
     */
    private String reservationCat;
    /**
     * { var_description.
     */
    private int day;
    /**
     * { var_description.
     */
    private int month;
    /**
     * { var_description.
     */
    private int year;
    /**
     *
     * Constructs the object.
     */
    Student() { }
    /**
     * Constructs the object.
     *
     * @param      name1       The name 1
     * @param      date1       The date 1
     * @param      m1          The m 1
     * @param      m2          The m 2
     * @param      m3          The m 3
     * @param      totalmarks  The totalmarks
     * @param      category1   The category 1
     */
    Student(final String name1, final String date1, final int m1,
        final int m2, final int m3, final int totalmarks,
        final String category1) {
        this.name = name1;
        this.date = date1;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.totmarks = totalmarks;
        this.reservationCat = category1;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String n = "";
        n = this.name + "," + this.totmarks + "," + this.reservationCat;
        return n;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the date.
     *
     * @return     The date.
     */
    public String getDate() {
        // return this.date;
        String[] d = this.date.split("-");
        this.day = Integer.parseInt(d[0]);
        this.month = Integer.parseInt(d[1]);
        this.year = Integer.parseInt(d[2]);
        return this.date;

    }
    /**
     * Gets the day.
     *
     * @return     The day.
     */
    public int getDay() {
        return this.day;
    }
    /**
     * Gets the month.
     *
     * @return     The month.
     */
    public int getMonth() {
        return this.month;
    }
    /**
     * Gets the year.
     *
     * @return     The year.
     */
    public int getYear() {
        return this.year;
    }
    /**
     * Gets the marks 1.
     *
     * @return     The marks 1.
     */
    public int getMarks1() {
        return this.marks1;
    }
    /**
     * Gets the marks 2.
     *
     * @return     The marks 2.
     */
    public int getMarks2() {
        return this.marks2;
    }
    /**
     * Gets the marks 3.
     *
     * @return     The marks 3.
     */
    public int getMarks3() {
        return this.marks3;
    }
    /**
     * Gets the totmarks.
     *
     * @return     The totmarks.
     */
    public int getTotmarks() {
        return this.totmarks;
    }
    /**
     * Gets the category.
     *
     * @return     The category.
     */
    public String getCategory() {
        return this.reservationCat;
    }
    /**
     * function_description.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Student that) {
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
