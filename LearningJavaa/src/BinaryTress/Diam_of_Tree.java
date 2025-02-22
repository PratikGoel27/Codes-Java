//package BinaryTress;
//
//public class Diam_of_Tree {
//
//    static class Node {
//        Node left;
//        Node right;
//        int data;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public static int diam(Node root) {
//        if(root == null) {
//            return 0;
//        }
//
//        int ldiam = diam(root.left);
//        int rdiam = diam(root.right);
//        int lh = height(root.left);
//        int rh = height(root.right);
//
//        return Math.max(ldiam, Math.max(rdiam, lh+rh+1));
//    }
//
//    public static void main(String[] args) {
//        /*
//                    1
//                   /  \
//                  2    3
//                 / \  / \
//                4   5 6   7
//        */
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//        //  System.out.println(height(root));
//        System.out.println(diam(root));
//    }
//}
