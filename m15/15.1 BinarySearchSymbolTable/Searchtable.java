public class Searchtable <Key extends Comparable<Key>, Value> {
    private static final int newcap = 2;
    private Key[] keys;
    private Value[] values;
    private int n = 0;
    Searchtable() {
        this(newcap);
    }
    public Searchtable(int capacity) {
        keys = (Key[]) new Comparable[capacity]; 
        values = (Value[]) new Object[capacity];
    }
    public int size() {
        return n;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    private void resize(int capacity) {
        assert capacity >= n;
        Key[]   tempk = (Key[])   new Comparable[capacity];
        Value[] tempv = (Value[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            tempk[i] = keys[i];
            tempv[i] = values[i];
        }
        values = tempv;
        keys = tempk;
    }
    public boolean contains(Key k) {
        return (get(k) != null);
    }
    public Value get(Key k) {
        if (isEmpty()) {
            return null;
        }
        int i = rank(k); 
        if (i < n && keys[i].compareTo(k) == 0) {
            return values[i];
        }
        return null;
    }
    public int rank(Key k) {
        int lo = 0, hi = n-1;
        while (lo <= hi) { 
            int mid = lo + (hi - lo) / 2; 
            int cmp = k.compareTo(keys[mid]);
            if (cmp < 0) {
                hi = mid - 1; 
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid; 
            }
        } 
        return lo;
    }
    public void put(Key key, Value val)  {
        if (val == null) {
            delete(key);
            return;
        }
        int i = rank(key);
        // key is already in table
        if (i < n && keys[i].compareTo(key) == 0) {
            values[i] = val;
            return;
        }
        // insert new key-value pair
        if (n == keys.length) {
            resize(2*keys.length);
        }
        for (int j = n; j > i; j--)  {
            keys[j] = keys[j-1];
            values[j] = values[j-1];
        }
        keys[i] = key;
        values[i] = val;
        n++;

        assert check();
    }
    public void delete(Key key) {
        if (isEmpty()) {
            return;
        }
        // compute rank
        int i = rank(key);
        // key not in table
        if (i == n || keys[i].compareTo(key) != 0) {
            return;
        }
        for (int j = i; j < n-1; j++)  {
            keys[j] = keys[j+1];
            values[j] = values[j+1];
        }

        n--;
        keys[n] = null;  // to avoid loitering
        values[n] = null;

        // resize if 1/4 full
        if (n > 0 && n == keys.length/4) {
            resize(keys.length/2);
        }

        assert check();
    }
     public Key select(int k) {
        return keys[k];
    }
    public void deleteMin() {
        delete(min());
    }
    public void deleteMax() {
        delete(max());
    }
    public Key min() {
        return keys[0];
    }
    public Key max() {
        return keys[n-1];
    }
     private boolean check() {
        return isSorted() && rankCheck();
    }

    // are the items in the array in ascending order?
    private boolean isSorted() {
        for (int i = 1; i < size(); i++)
            if (keys[i].compareTo(keys[i-1]) < 0) return false;
        return true;
    }

    // check that rank(select(i)) = i
    private boolean rankCheck() {
        for (int i = 0; i < size(); i++) {
            if (i != rank(select(i))) {
                return false;
            }
        }
        for (int i = 0; i < size(); i++) {
            if (keys[i].compareTo(select(rank(keys[i]))) != 0) {
                return false;
            }
        }
        return true;
    }
    public Key floor(Key key) {
        int i = rank(key);
        if (i < n && key.compareTo(keys[i]) == 0) {
            return keys[i];
        }
        if (i == 0) {
            return null;
        } else {
            return keys[i-1];
        }
    }
     public void keys() {
        for(int i = 0;i< n;i++) {
            System.out.println(keys[i] + " " + values[i]);
        }
    }

}