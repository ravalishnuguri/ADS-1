import java.util.Arrays;
class Insertion {

    private Teamdetails[] teamArray;

    private int size;

    private static final int TEN = 10;

    Insertion() {
        this.size = 0;
        this.teamArray = new Teamdetails[TEN];
    }

    public int size() {
        return size;
    }

    public void resize() {
        teamArray = Arrays.copyOf(teamArray,
            2 * teamArray.length);
    }

    public void add(final Teamdetails game) {
        if (size == teamArray.length) {
            resize();
        }
        teamArray[size++] = game;
    }

    public void insertionsort() {
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (teamArray[j].compareTo(teamArray[j - 1]) == 1) {
                    exchange(teamArray, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public void exchange(final Comparable[] a, final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public String toString() {
        int k = 0;
        String str = "";
        for (k = 0; k < size - 1; k++) {
            str += teamArray[k].getTeam() + ",";
        }
        str += teamArray[k].getTeam();
        return str;
    }
}