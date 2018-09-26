import java.util.Scanner;
import java.util.Arrays;
/**
 * Solution class.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        sum u = new sum();
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        u.counntof(arr);
    }
}
/**
 * Class for sum.
 */
class sum {
    /**
     * Constructs the object.
     */
    sum() { }
    /**
     * function_description.
     *
     * @param      arr1  The arr 1
     */
    public void counntof(final int[] arr1) {
        int count = 0;
        Arrays.sort(arr1);
        int size = arr1.length;
        for (int i = 0; i < size - 1; i++) {
            int num = 0;
            for (int j = i + 1; j < size; j++) {
                num = -1 * (arr1[i] + arr1[j]);
                
                    if (binarySearch(arr1, num, j + 1) != - 1) {
                        count++;
                    }
                
            }
        }
        System.out.println(count);
    }
    /**
     * function_description.
     *
     * @param      a     { parameter_description }
     * @param      key   The key
     * @param      lo    The lower
     *
     * @return     { description_of_the_return_value }
     */
public static int binarySearch(final int[] a, final int key, int lo) {
         int hi = a.length - 1;
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
