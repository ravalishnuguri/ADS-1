public class BST<Key extends Comparable<Key>, Value> {
    private Node root;
    int size = 0;
    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int count;
    }
    public void put(Key key, Value value) {
        if (key == null)  {
            System.out.println("null");
        }
        root = put(root, key, value);
    }
    /**
     * the time complexity for the method is O(logN).
     *
     * @param      root   The root
     * @param      key    The key
     * @param      value  The value
     *
     * @return     { description_of_the_return_value }
     */
    private Node put(Node root, Key key, Value value) {
        if (root == null) {
            Node n = new Node();
            n.key = key;
            n.value = value;
            n.left = null;
            n.right = null;
            root = n;
            size++;
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            root.left  = put(root.left,  key, value);
        }
        else if (cmp > 0) {
            root.right = put(root.right, key, value);
        }
        else {
            root.value = value;
        }
        root.count = 1 + size(root.left) + size(root.right);
        return root;

    }
    public Value get(Key key) {
        return get(root, key);
    }
    /**
     * the time complexity for the method is O(logN).
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Value get(Node x, Key key) {
        if (key == null) {
            System.out.println("empty");
        }
        if (x == null) {
            //System.out.println("in get");
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        }
        else if (cmp > 0) {
            return get(x.right, key);
        }
        else {
            return x.value;
        }
    }
    
    public Key min() {
        return min(root).key;
    }
    private Node min(Node x) { 
        if (x.left == null) {
            return x; 
        }
        else {
            return min(x.left); 
        }
    }
    public Key max() {
        return max(root).key;
    }
    private Node max(Node x) {
        if (x.right == null) {
            return x;
        }
        else {
            return max(x.right);
        }
    }
    
    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }
    private Node floor(Node x, Key key) {
         if (x == null) {
            return null;
         }
         int cmp = key.compareTo(x.key);
         if (cmp == 0) {
            return x;
         }
         if (cmp < 0) {
            return floor(x.left, key);            
         }
         Node t = floor(x.right, key);
         if (t != null) {
            return t;
         }
         else {
            return x;
         }
    }


    public Key ceiling(Key key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }
    private Node ceiling(Node x, Key key) {
        if (x == null) {
            return null;
         }
         int cmp = key.compareTo(x.key);
         if (cmp == 0) {
            return x;
         }
         if (cmp > 0) {
            return ceiling(x.right, key);            
         }
         Node t = ceiling(x.left, key);
         if (t != null) {
            return t;
         }
         else {
            return x;
         }
    }
    public int size() { 
        return size(root);
    }
    private int size(Node x) {
        if (x == null) {
            return 0;
        }
        return x.count;
    }

    public Key select(int k) {
        Node x = select(root, k);
        return x.key;
    }

    // Return key of rank k. 
    private Node select(Node x, int k) {
        if (x == null) {
            return null; 
        }
        int t = size(x.left); 
        if (t > k) {
            return select(x.left,  k); 
        }
        else if (t < k) {
            return select(x.right, k - t - 1); 
        }
        else {
            return x; 
        }
    }
}