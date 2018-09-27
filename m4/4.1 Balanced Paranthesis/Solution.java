import java.util.Scanner;;
class Balancedornot {
  private class Stack {
  int top = -1;
  char item[] = new char[1000];
  public void push(char x) {
  item[++top] = x;
}
  public char pop() {
    char e = item[top];
    top--;
    return e;
    }
  public boolean isEmpty() {
    return top == -1;
  }
}
  public boolean balancedparenthesis(char c1, char c2) {
       if (c1 == '(' && c2 == ')')
         return true;
       else if (c1 == '{' && c2 == '}')
         return true;
       else if (c1 == '[' && c2 == ']')
         return true;
       else
         return false;
    }
  public String balanced(char[] exp) {
    Stack st = new Stack();
    for(int i=0;i<exp.length;i++) {
      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
            st.push(exp[i]);
          }
      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
             if (st.isEmpty()) {
                   return "NO";
               }
      else if ( !balancedparenthesis(st.pop(), exp[i]) ) {
                   return "NO";
               }
          }
           
       }
       
      if (st.isEmpty()) {
         return "YES";
  }
      else {
             return "NO";
         } 
    }
}

public class Solution {
  public static void main(String[] args) {
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
