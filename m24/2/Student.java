/**
 * Class for student.
 */
class Student implements Comparable<Student> {
    /**
     * { var_description }.
     */
    private int rollno;
    /**
     * { var_description }.
     */
    private String name;
    /**
     * { var_description }.
     */
    private Double marks;
    /**
     * Constructs the object.
     */
    Student() { }
    /**
     * Constructs the object.
     *
     * @param      rollno1  The rollno 1
     * @param      name1    The name 1
     * @param      marks1   The marks 1
     */
    Student(final String rollno1, final String name1, final Double marks1) {
        this.rollno = Integer.parseInt(rollno1);
        this.name = name1;
        this.marks = marks1;
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
     * Gets the rollno.
     *
     * @return     The rollno.
     */
    public int getRollno() {
        return this.rollno;
    }
    /**
     * Gets the marks.
     *
     * @return     The marks.
     */
    public Double getMarks() {
        return this.marks;
    }
    /**
     * { function_description }.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
     public int compareTo(final Student that) {
        if (this.getMarks() < that.getMarks()) {
            return 1;
        } else if (this.getMarks() > that.getMarks()) {
            return -1;
        } else {
            return 0;
        }
    }

}
