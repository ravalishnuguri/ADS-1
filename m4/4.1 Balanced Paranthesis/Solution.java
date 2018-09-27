import java.util.Scanner;
/**
 * Class for balancedornot.
 */
class Balancedornot {
  /**
   * List of .
   */
  private class Stack {
    /**
     * var_description.
     */
  private int top = -1;
  /**
   * var_description.
   */
final int number = 1000;
  /**
   * item_description.
   */
  private char item[] = new char[number];
  /**
   * function_description.
   *
   * @param      x     { parameter_description }
   */
  public void push(final char x) {
  item[++top] = x;
}
/**
 * function_description.
 *
 * @return     { description_of_the_return_value }
 */
  public char pop() {
    char e = item[top];
    top--;
    return e;
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
  public boolean isEmpty() {
    return top == -1;
  }
}
/**
 * function_description.
 *
 * @param      c1    The c 1
 * @param      c2    The c 2
 *
 * @return     { description_of_the_return_value }
 */
  public boolean balancedparenthesis(final char c1, final char c2) {
       if (c1 == '(' && c2 == ')') {
         return true;
       } else if (c1 == '{' && c2 == '}') {
         return true;
       } else if (c1 == '[' && c2 == ']') {
         return true;
       }
       return false;
    }
    /**
     * function_description.
     *
     * @param      exp   The exponent
     *
     * @return     { description_of_the_return_value }
     */
  public String balanced(final char[] exp) {
    Stack st = new Stack();
    for (int i = 0; i < exp.length; i++) {
      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
            st.push(exp[i]);
          }
      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
             if (st.isEmpty()) {
                   return "NO";
               } else if (!balancedparenthesis(st.pop(), exp[i])) {
                   return "NO";
               }
          }   
       }
      if (st.isEmpty()) {
         return "YES";
  } else {
             return "NO";
         }
    }
}
/**
 * Class for solution.
 */
final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() { }
  /**
   * .function_description.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
  Balancedornot b = new Balancedornot();
  Scanner sc = new Scanner(System.in);
  String numberoflines = sc.nextLine();
  int n = Integer.parseInt(numberoflines);
  int num = 0;
  while (num < n) {
    String tokens = sc.nextLine();
    char[] line = tokens.toCharArray();
    System.out.println(b.balanced(line));
    num++;
    }
  }
}
