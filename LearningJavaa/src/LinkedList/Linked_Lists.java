package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_Lists {

    public static Node head = null;
    public static Node tail = null;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void add(int data, int idx) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return - 1;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return -1;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        int val = temp.next.data;
        size--;
        temp.next = null;
        tail = temp;
        return val;
    }

    public static int remove(int idx) {
        if(size == 0) {
            System.out.println("LL is empty");
            return -1;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }else {
            Node temp = head;
            int i = 0;

            while(i < idx-1) {
                temp = temp.next;
                i++;
            }
            
            int val = temp.next.data;
            size--;
            temp.next = temp.next.next;
            return val;
        } 
    }

    public static int search(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }else {
                temp = temp.next;
                i++;
            }
        }

        return -1;
    }

    public static void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linked_Lists ll = new Linked_Lists();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.display();
        // ll.removeLast();
        // ll.add(4, 3);
        // ll.display();
        // System.out.println(ll.search(3));
        ll.remove(2);
        ll.display();
    }
}
