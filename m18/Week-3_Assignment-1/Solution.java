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
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
            final int mag = 6;
            Scanner sc = new Scanner(System.in);
        BST<String, Integer> bs = new BST<String, Integer>();
        int n = sc.nextInt();
        for (int i = 1; i <= (mag * n); i++) {
            String str = sc.nextLine();
            String[] tokens = str.split(",");
            Stockdata sd = new Stockdata(tokens[0],
                Float.parseFloat(tokens[1]));
        }
        int n1 = sc.nextInt();
        if (n1 != 0) {
            for (int j = 1; j <= n1; j++) {
                String str1 = sc.nextLine();
                String[] tokens1 = str1.split(",");
                switch (tokens1[0]) {
                    case "get":
                    switch (tokens1[1]) {
                        case "minST":
                        bs.minST(tokens1[2]);
                        break;
                        case "maxST":
                        bs.maxST(tokens1[2]);
                        break;
                        default:
                        break;
                    }
                    break;
                    case "intersection":
                    System.out.println(bs.intersection());
                    break;
                    default:
                    break;
                }
            }
        }
        } catch (java.lang.ArrayIndexOutOfBoundsException exception) {
            System.out.println("");
        }
    }
}
/**
 * Class for stockdata.
 */
class Stockdata {
    /**
     *  the variable for stocknames.
     */
    private String stockname;
    /**
     * the variable for stock percentage change.
     */
    private Float stockchange;
     /**
     *the object to access of minheap.
     */
    private MinPQ<Double> minObj;
    /**
     *the object to access of maxheap.
     */
    private MaxPQ<Double> maxObj;
    /**
     * Constructs the object.
     *
     * @param      stock   The stock
     * @param      change  The change
     */
    Stockdata(final String stock, final Float change) {
        this.stockname = stock;
        this.stockchange = change;
    }
    /**
     * get method.
     *
     * @return     { description_of_the_return_value }
     */
    public String getname() {
        return this.stockname;
    }
    /**
     * Gets the change.
     *
     * @return     The change.
     */
    public Float getChange() {
        return this.stockchange;
    }
    /**
     * compare to method.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Stockdata that) {
        if (this.getname().compareTo(that.getname()) > 0) {
            return 1;
        } else if (this.getname().compareTo(that.getname()) < 0) {
            return -1;
        } else if (this.getChange().compareTo(that.getChange()) < 0) {
            return -1;
        } else if (this.getChange().compareTo(that.getChange()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
