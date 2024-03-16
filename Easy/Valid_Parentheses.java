// Runtime 1ms 
import java.util.Scanner;
import java.util.Stack;
public class Valid_Parentheses {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        if(isValid(s) == true)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) { 
            if (c == '(') 
                stack.push(')'); 
            else if (c == '{')
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
               
                return false;
        }
  
        return stack.isEmpty();
    }
}