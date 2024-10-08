package Stacks.SolvedOnes;
import java.util.Stack;

public class Reverse_a_Stack {
    public static void PushingAtBottom(Stack<Integer> s,int data) {
        if(s.isEmpty() == true) {
            s.push(data);
            return;
        }
        int a = s.peek();
        s.pop();
        PushingAtBottom(s, data);
        s.push(a);
    }

    public static void reversingStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int a = s.pop();
        reversingStack(s);
        PushingAtBottom(s,a);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reversingStack(s);
        System.out.println("Stack after reversing:- ");
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
