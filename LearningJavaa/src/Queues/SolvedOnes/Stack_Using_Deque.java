package Queues.SolvedOnes;
import java.util.*;
public class Stack_Using_Deque {

    static class Stacks {
        static Deque<Integer> dq = new LinkedList<>();

        public static void push(int data) {
            dq.addFirst(data);
        }

        public static int pop() {
            int top = dq.removeFirst();
            return top;
        }

        public static int peek() {
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
