import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Noofpairs n = new Noofpairs();
        int in1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[in1];
        for (int i = 0;i< in1;i++) {
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(n.countofpairs(arr1,in1));
    }
}

class Noofpairs {
    Noofpairs() { }

    public int countofpairs(int[] arr, int len) {
        int count = 1;
        int temp = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 1;i < len ;i++) {
        if (arr[i]==arr[i-1]) {
            count++;
        }
        else {
            temp = temp + (count * (count - 1)) / 2;
            count = 1;
        }
        }
        temp = temp + (count* (count - 1)) / 2;
        return temp;
    }

}