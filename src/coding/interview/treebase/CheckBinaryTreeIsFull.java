package coding.interview.treebase;

public class CheckBinaryTreeIsFull {
    /*
    * https://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/ */

    Node root;
    CheckBinaryTreeIsFull(){
        root = null;
    }
    CheckBinaryTreeIsFull(int item){
        root = new Node(item);
    }

    public static void main(String[] args){
        //Create a tree
        CheckBinaryTreeIsFull tree = new CheckBinaryTreeIsFull();
        /*tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left= new Node(4);*/
        //tree.root.left.right = new Node(5);

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right = new Node(70);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(90);
        tree.root.right.right.left = new Node(80);
        tree.root.right.right.right = new Node(90);
        System.out.println("The binary tree is full: "+ checkFull(tree.root));
    }
    private static boolean checkFull(Node node){
        //a binary tree T is full if each node is either a leaf or possesses exactly two child nodes.
        if(node == null){
            return true;
        }
        //leaf case
        if(node.left == null && node.right == null){
            return true;
        }
        //have both children
        if(node.left != null && node.right != null){
            return checkFull(node.left) && checkFull(node.right);
        }
        return false;
    }
}
