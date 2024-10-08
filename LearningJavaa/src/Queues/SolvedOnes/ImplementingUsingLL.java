package Queues.SolvedOnes;

public class ImplementingUsingLL {
    // NODE CLASS:-
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 
    // Queue Class:-
    static class Queue {
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            // SINGLE ELEMENT:-
            if(head == tail) {
                head = tail = null;
            }else {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        
    }
}
