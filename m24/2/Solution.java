import java.util.Scanner;
class Solution {
    private Solution() { }

    public static void between(Student[] a,Double m1, Double m2) {
        Selection t = new Selection();
        t.Sort(a, a.length);
        for (int i = 0; i < a.length ; i++) {
            if (a[i].getMarks() >= m1 && a[i].getMarks()<= m2) {
                System.out.println(a[i].getName());
            }
    }
}
public static void less(Student[] a, Double m1) {
    for (int i = 0; i< a.length ; i++) {
        if (a[i].getMarks() <= m1) {
            System.out.println(a[i].getName());
        }
    }
}
public static void great(Student[] a, Double m1) {
    for (int i =0; i< a.length;i++) {
        if(a[i].getMarks() >= m1) {
            System.out.println(a[i].getName());
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        // BST<String, Integer> bst = new BST<String, Integer>();
        Selection t = new Selection();
        int num = sc.nextInt();
        Student[] students = new Student[num];
        sc.nextLine();
        for(int i = 0; i < num; i++) {
            String[] tokens = sc.nextLine().split(",");
            // bst.put(new Student(tokens[0], tokens[1], tokens[2]), i);
            students[size++] = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
        }
        t.Sort(students, size);
        int no = sc.nextInt();
        sc.nextLine();
            for(int j = 0; j< no ; j++) {
                String[] tok = sc.nextLine().split(" ");
                switch (tok[0]) {
                    case "BE":
                    between(students, Double.parseDouble(tok[1]), Double.parseDouble(tok[2]));
                    break;
                    case "LE":
                    less(students, Double.parseDouble(tok[1]));
                    break;
                    case "GE":
                    great(students, Double.parseDouble(tok[1]));
                    break;
                    
                }
                
            }
        }
}

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
        if (this.getRollno() > that.getRollno()) {
            return 1;
        } else {
            return 0;
        }
    }

}

class Selection {
    Selection() {

    }
    public void Sort(Comparable[] array, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array, i, j)) {
                    swap(array, j, min);
                }
            }
        }
    }
    public boolean less(Comparable[] arr, int ind1, int ind2) {
        return arr[ind1].compareTo(arr[ind2]) < 0;
    }

    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
   
}