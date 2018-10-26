import java.util.ArrayList;
/**.
LinearProbing the class 
*/
class LinearProbing<Key, Value>{
/**.
capacity the capacity
*/ 
    private static final  int capacity = 4;
/**.
keys the keys array for generic type 
*/
    private Key[] keys;
/**.
values the values
*/
    private Value[] values;
    /**
     *number of key-value pairs in table.
     */
    private int keyValuePairs;
    /**
     *size of the table.
     */
/**.
length the length
*/
    private int length;
/**
 * Constructs the object.
 */
    public LinearProbing(){
        this(capacity);
    }
    /**
     * Constructs the object.
     *
     * @param      capacity  The capacity
     */
LinearProbing(int capacity){
        length = capacity;
        keyValuePairs = 0;
        keys = (Key[]) new Object[length];
        values = (Value[]) new Object[length];
    }
/**
 * method for hash.
 * returns value between 0 and M-1
 *
 * @param      key   The key
 *
 * @return     hash value.
 */
private int hash(Key key){
        return ((11 * key.hashCode()) % length);
    }
/**
 * method for contains.
 *
 * @param      key   The key
 *
 * @return     returns true or false.
 */
public boolean contains(Key key){
        return get(key) != null;
    }
/**
 * method for resize.
 *
 * @param      capacity  The capacity
 */
public void resize(int capacity){
    LinearProbing<Key, Value> temp
    = new LinearProbing<Key, Value>(capacity);
    for(int i = 0; i < length; i++){
        if(keys[i] != null){
            temp.put(keys[i], values[i]);
        }
    }
    keys = temp.keys;
    values = temp.values;
    length = temp.length;
    }
/**
 * method for put.
 * it has a constant time complexity.
 *
 * @param      key    The key
 * @param      value  The value
 */
public void put(Key key, Value value){
        if(keyValuePairs >= (length / 2)) {
            resize(2 * length);
        }
        int i;
        for(i = hash(key); keys[i] != null; i = (i + 1) % length){
            if(keys[i].equals(key)){
                values[i] = value;
                return;
        }
        }
        keys[i] = key;
        values[i] = value;
        keyValuePairs++;
    }
/**
 * gets the key.
 * it has a Constant time-complexity.
 *
 * @param      key   The key
 *
 * @return     { description_of_the_return_value }
 */
public Value get(Key key){
        int i;
        for(i = hash(key); keys[i] != null; i = (i + 1) % length){
            if(keys[i].equals(key)){
                return values[i];
            }
        }
        return null;
    }
/**
 * deletes the key.
 *
 * @param      key   The key
 */
public void delete(Key key){
        if (!contains(key)) return;
        int i;
        for(i = hash(key); !keys[i].equals(key); i = (i + 1) % length){
        }
        keys[i] = null;
        values[i] = null;
        i = (i + 1) % length;
        while(keys[i] != null){
            Key tempKey = keys[i];
            Value tempValue = values[i];
            keyValuePairs--;
            keys[i] = null;
            values[i] = null;
            put(tempKey, tempValue);
            i = (i + 1) % length;
        }
        keyValuePairs--;
        if(keyValuePairs >= 0 && keyValuePairs <= length / 8){
            resize(length / 2);
        }
    }
/**
 * returns the list.
 *
 * @return     { description_of_the_return_value }
 */
public Iterable<Key> keys() {
        ArrayList<Key> list = new ArrayList<Key>();
        for (int i = 0; i < length; i++) {
            if (keys[i] != null) {
                list.add(keys[i]);
            }
        }
        return list;
}
/**
 * displays the keys and values.
 */
public void display(){
        String print = "{";
        if(keyValuePairs == 0){
            System.out.println("{}");
            return;
        }
        for(Key s : keys()) {
            print += s + ":" + get(s) + ", ";
        }
        String newprint = print.substring(0, print.length() - 2) + "}";
        System.out.println(newprint);
    }
}