public class Selection {
    public Selection() {

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
    public String Meritorder(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
    // public String Criteria(Comparable[] array, int size, int op, int bc, int sc, int st) {
    //     int flag = 0;
    //     Sort(array, size);
    //     String s = "";
    //     for (int i = 0; i < op; i++) {
    //         s += array[i].toString() + "\n";
    //     }
    //     if (bc== 0) {
    //         flag = 0;
    //     } else {
    //         for (int j = 0; j< bc; j++) {
    //             if (array[j].toString1() == "BC") {
    //                 s += array[j].toString() + "\n";
    //             }
                
    //         }
    //     }
    //     if (sc == 0) {
    //         flag = 0;
    //     } else {
    //         for (int k = 0; k < sc; k++) {
    //             if (array[k].getCategory() == "SC") {
    //                 s += array[k].toString() + "\n";
    //             }
                
    //         }
    //     }
    //     if (st == 0) {
    //         flag = 0;
    //     } else {
    //         for (int o = 0; o< st; o++) {
    //             if (array[o].getCategory() == "ST") {
    //                 s += array[o].toString() + "\n";
    //             }
                
    //         }
    //     }
    //     return s;
    // }
}