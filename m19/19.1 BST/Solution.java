import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { function_description }.
     * the time complexity for the main method is O(n).
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<String, Integer> bs = new BST<String, Integer>();
        while (sc.hasNextLine()) {
            String st = sc.nextLine();
            String[] tokens = st.split(",");
            int toksize = tokens.length;
            if(toksize < 3) {
            	switch (tokens[0]) {
            	case "max":
            	// System.out.println("working");
                System.out.println((bs.max().Print()));
                break;
                case "min":
                System.out.println(bs.min().Print());
            	// System.out.println("working");
                break;
                case "select":
                // System.out.println(bs.select(Integer.parseInt(tokens[1])).Print());
            	// System.out.println("working");
                break;
            	}
            } else {
            	Book b = new Book(tokens[1], tokens[2],
                Float.parseFloat(tokens[2 + 1]));
            switch (tokens[0]) {
                case "put":
                bs.put(b, Integer.parseInt(tokens[2 + 2]));
                break;
                case "get":
                System.out.println(bs.get(b));
                break;
                
                case "floor":
                System.out.println(bs.floor(b).Print());
                break;
                case "ceiling":
                System.out.println(bs.ceiling(b).Print());
                break;
                default:
                break;
            }
            }
        }
    }
}

/**
 * Class for book.
 */
class Book {
    /**
     * { var_description.
     */
    private String name;
    /**
     * { var_description.
     */
    private String author;
    /**
     * var_description.
     */
    private Float price;
    /**
     * Constructs the object.
     */
    public Book() { }
    /**
     * Constructs the object.
     *
     * @param      bname    The bname
     * @param      bauthor  The bauthor
     * @param      bprice   The bprice
     */
    Book(final String bname, final String bauthor,
        final Float bprice) {
        this.name = bname;
        this.author = bauthor;
        this.price = bprice;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
     public String getname() {
        return this.name;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public String getauthor() {
        return this.author;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public Float getprice() {
        return this.price;
    }
    /**
     * function_description.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Book that) {
        if (this.getname().compareTo(that.getname()) > 0) {
            return 1;
        } else if (this.getname().compareTo(that.getname()) < 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) < 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) > 0) {
            return 1;
        } else if (this.getprice() > that.getprice()) {
            return 1;
        } else if (this.getprice() < that.getprice()) {
            return -1;
        } else {
            return 0;
        }
    }
    public String Print() {
    	String m = "";
    	m += this.getname() + ", " + this.getauthor() + ", " + this.getprice();
    	return m;
    }
}
