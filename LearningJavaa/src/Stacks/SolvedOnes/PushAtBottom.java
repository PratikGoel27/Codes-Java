package Stacks.SolvedOnes;

import java.util.Stack;

public class PushAtBottom {

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
    public static void main(String[] args) {
        // Stack<Integer> a = new Stack<>();
        // Stack<Integer> a2 = new Stack<>();
        // a.push(1);
        // a.push(2);
        // a.push(3);
        // // STORING STACK ITEMS OF A TO A2:-
        // while(!a.isEmpty()) {
        //     a2.push(a.peek());
        //     a.pop();
        // }
        // // PUSHING ELEMENTS BACK TO THE STACK A:-
        // a.push(4);
        // while(!a2.isEmpty()) {
        //     a.push(a2.peek());
        //     a2.pop();
        // }
        // // PRINTING STACK:-
        // while(!a.isEmpty()) {
        //     System.out.println(a.peek());
        //     a.pop();
        // }

        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        PushingAtBottom(s,4);

        while(!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }


    }
}
