package Stacks;
import java.util.*;;
public class DuplicateParentheses {
    public static boolean isDup(String str) {
        Stack<Character> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            char ch = str.charAt(i);
            if(ch == ')') {
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                s.pop();
                if(count == 0) {
                    return true;
                }
            }else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+c)";
        System.out.println(isDup(str));
    }
}
