import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        System.out.println(size1);
        System.out.println(size2);
        int[] firstarr = new int[size1];
        int[] secondarr = new int[size2];
        String[] arr1 = sc.nextLine().split(",");
        String[] arr2 = sc.nextLine().split(",");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // for (int i = 0;i<size;i++) {
        //     arr[i] = Integer.parseInt(sc.nextLine());
        // }
        // int size = Integer.parseInt(sc.nextLine());
        // int[] arr = new int[size];
        // for (int i = 0;i<size;i++) {
        //     arr[i] = Integer.parseInt(sc.nextLine());
    }
}