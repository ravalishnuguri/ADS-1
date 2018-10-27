class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private Double marks;
    Student() { }
    Student(String rollno1, String name1, Double marks1) {
        this.rollno = Integer.parseInt(rollno1);
        this.name = name1;
        this.marks = marks1;
    }

    public String getName() {
        return this.name;
    }
    public int getRollno() {
        return this.rollno;
    }
    public Double getMarks() {
        return this.marks;
    }
     public int compareTo(final Student that) {
        if (this.getMarks() < that.getMarks()) {
            return 1;
        } else if(this.getMarks() > that.getMarks()) {
            return -1;
        } else {
            return 0;
        }
    }

}
