package BinaryTress;

public class Count_of_Nodes {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int count(Node root) {
        if(root == null) {
            return 0;
        }

        int lcount = count(root.left);
        int rcount = count(root.right);
        return lcount+rcount+1;
    }

    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }
    
    public static void main(String[] args) {
        /*
                    1
                   /  \
                  2    3
                 / \  / \
                4   5 6   7
        */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
        //  System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
    }
}
