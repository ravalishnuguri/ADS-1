import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort s = new Sort();
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        sc.nextLine();
        int[] firstarr = new int[size1];
        int[] secondarr = new int[size2];
        String[] arr1 = sc.nextLine().split(",");
        String[] arr2 = sc.nextLine().split(",");
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        for(int i = 0;i<size1;i++) {
            firstarr[i] = Integer.parseInt(arr1[i]);
        }
        for(int j = 0;j<size2;j++) {
            secondarr[j] = Integer.parseInt(arr2[j]);
        }
        s.sortarray(firstarr,secondarr,size1,size2);
        // s.toString();

    }
}

class Sort {
    public void sortarray(int[] a1,int[] a2,int len1,int len2) {
        int[] res = new int[len1+len2];
        int i = 0, j = 0, k = 0;
        int p;
        while (i<len1 && j <len2) { 
            if (a1[i] < a2[j])
                res[k++] = a1[i++];
            else
                res[k++] = a2[j++]; 
        } 
      
        while (i < len1) 
            res[k++] = a1[i++]; 
      
        while (j < len2) 
            res[k++] = a2[j++];
        while(len1 == 0) {
            for(p = 0; p < len1; p++) {
            System.out.print(a1[p]+",");
        }
        System.out.print(a1[p]);

        }
        for(p = 0; p < k -1; p++) {
            System.out.print(res[p]+",");
        }
        System.out.print(res[p]);
        }
    }
    // public String toString() {
    //     // Replace the code below
    //     if (size == 0) {
    //         return "[]";
    //     }
    //     String str = "[";
    //     int i = 0;
    //     for (i = 0; i < size - 1; i++) {
    //         str = str + res[i] + ",";
    //     }
    //     str = str + res[i] + "]";
    //     return str;
    // }