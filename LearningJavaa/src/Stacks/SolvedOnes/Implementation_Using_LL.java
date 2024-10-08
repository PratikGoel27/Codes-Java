package Stacks.SolvedOnes;

public class Implementation_Using_LL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackLL {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if(isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int a = head.data;
            head = head.next;
            return a;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        StackLL a = new StackLL();
        a.push(3);
        a.push(2);        
        a.push(1);        
        a.push(0);
        a.pop();
        
        while(!a.isEmpty()) {
            System.out.print(a.peek()+" ");
            a.pop();
        }
    }
}
