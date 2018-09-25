import java.util.Scanner;
class Percolation {
    private int[][] id;
   public Percolation(int n) {
    // create n-by-n grid, with all sites blocked
    int[][] id = new int[n][n];
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            id[i][j] = -1;
            // System.out.println(id[i][j]);
            }
        }
   }
   public    void open(int row, int col){
    // open site (row, col) if it is not open already
    if(!isOpen(row, col)) {
        id[row][col] = 1;
    }
   }
   public boolean isOpen(int row, int col) {
    // is site (row, col) open?
    if (id[row][col] == 1) {
        return true;
    }
    return false;
   }  
   public boolean isFull(int row, int col) {
    return false;

   } // is site (row, col) full?
   public     int numberOfOpenSites() {
    // number of open sites
    int count = 0;
    for(int p = 1; p <=id.length; p++) {
        for(int q = 1; q <= id[0].length; q++) {
            if(id[p][q] == 1) {
                count++;
            }
        }

    }
    return count;
   }
   public boolean percolates()  {
    return true;

   }            // does the system percolate?
}
// You can implement the above API to solve the problem
class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        Percolation p = new Percolation(num);
        while(s.hasNext()) {
            String line = s.nextLine();
             String[] tokens = line.split(" ");
             int x = Integer.parseInt(tokens[0]);
             int y = Integer.parseInt(tokens[1]);
             p.open(x, y);
        }
        p.percolates();
    }
}