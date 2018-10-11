import java.util.Scanner;
class Solution {
	private Solution() { }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST<String, Integer> bs = new BST<String, Integer>(); 
		while (sc.hasNextLine()) {
			String st = sc.nextLine();
			String[] tokens = st.split(",");
			Book b = new Book(tokens[1],tokens[2],Float.parseFloat(tokens[3]));
			switch(tokens[0]) {
				case "put":
				bs.put(b,Integer.parseInt(tokens[4]));
				break;
				case "get":
				System.out.println(bs.get(b));
				break;
				default:
				break;
			}
		}
	}
}
class Book {
	private String name;
	private String author;
	private Float price;
	Book() { }
	public Book(String bname, String bauthor, Float bprice) {
		this.name = bname;
		this.author = bauthor;
		this.price = bprice;
	}
	 public String getname() {
        return this.name;
    }
    public String getauthor() {
        return this.author;
    }
    public Float getprice() {
        return this.price;
    }
    public int compareTo(Book that) {
        if(this.getname().compareTo(that.getname()) > 0) {
            return 1;
        } else if(this.getname().compareTo(that.getname()) < 0) {
            return -1;
        } else if(this.getauthor().compareTo(that.getauthor()) < 0) {
            return -1;
        } else if(this.getauthor().compareTo(that.getauthor()) > 0) {
            return 1;
        } else if(this.getprice() > that.getprice()) {
            return 1;
        } else if(this.getprice() < that.getprice()) {
            return -1;
        } else {
            return 0;
        }
    }
}