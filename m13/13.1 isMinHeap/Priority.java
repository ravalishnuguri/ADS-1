import java.util.Arrays;
/**
 * Class for priority.
 *
 * @param      <E>   { parameter_description }
 */
class Priority<E extends Comparable<E>> {
	E[] array;
	int size;
	/**
	 * Constructs the object.
	 *
	 * @param      a     { parameter_description }
	 */
	Priority(final E[] a) {
		this.array = a;
	}
	/**
	 * function_description.
	 *
	 * @return     { description_of_the_return_value }
	 */
	public boolean isminHeap() {
		for(int i = 1; i < array.length; i++) {
			if(2 * i < array.length && greater(2 * i,i)) {
				return false;
			} if((2 * i) + 1 < array.length && greater(2 * i+1,i)) {
				return false;
			}
		}
		return true;
	}
	/**
	 * { function_description }
	 *
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
    public boolean greater(int i, int j) {
    	return array[i].compareTo(array[j]) < 0;
    }
}