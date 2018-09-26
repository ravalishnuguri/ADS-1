import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum u = new sum();
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0;i<size;i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        u.counntof(arr);
    }
}
class sum {
    sum() { }
    public void counntof(int[] arr1) {
        int count = 0;
        Arrays.sort(arr1);
        int size = arr1.length;
        for (int i = 0; i < size; i++) {
            int num = 0;
            for (int j = i+1; j < size; j++) {
                num = -1 * (arr1[i] + arr1[j]);
                for (int k = j+1; k < size;k = k / 2) {
                    if (binarySearch(arr1, num, k)!= -1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
public static int binarySearch(int[] a, int key, int lo) {
         int hi = a.length-1;
         while (lo <= hi) {
         int mid = lo + (hi - lo) / 2;
         if (key < a[mid]) {
            hi = mid - 1;
         }
         else if (key > a[mid]) {
            lo = mid + 1;
        } else {
        return mid;
        }
    }
    return -1;
    }
}
