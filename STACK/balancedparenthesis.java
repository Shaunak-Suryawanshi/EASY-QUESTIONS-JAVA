
import java.util.Stack;

public class balancedparenthesis {

    public static void main(String[] args) {
        
        String s = "{[()]}";

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            else{
                if(stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }

                char top = stack.pop();

                if(
                    (ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')){
                        System.out.println("Not balnced");
                        return;
                    }


            }
        }

        if(stack.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
    
}
