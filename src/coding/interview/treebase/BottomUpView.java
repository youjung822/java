package coding.interview.treebase;

public class BottomUpView {
    /*  https://www.geeksforgeeks.org/bottom-view-binary-tree/
    *

    if x is the bottommost node at its horizontal distance
    x left child = x's horizontal distance -1
    x right child = x's horizontal distance +1
    */

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        printBottomView(tree.root);
    }

    private static void printBottomView(Node node){

    }
}
