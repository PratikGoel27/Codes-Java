package BinaryTress;

public class Subtree_Of_a_Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subroot) {
        if(node == null && subroot == null) {
            return true;
        }else if(node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        if(!isIdentical(node.left, subroot.left)) {
            return false;
        }
        if(!isIdentical(node.right, subroot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if(root == null) {
            return false;
        }
        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
    public static void main(String[] args) {
        // TREE:-
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.right = new Node(6);

        // SUBTREE:-
        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);

        System.out.print(isSubTree(tree, subTree));
    }
}
