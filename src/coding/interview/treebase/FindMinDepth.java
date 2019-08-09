package coding.interview.treebase;

public class FindMinDepth {
    /* https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
    * Given a binary tree, find its minimum depth. The minimum depth is
    * the number of nodes along the shortest path from the root node down
    * to the nearest leaf node.
    * For example, minimum height of below Binary Tree is 2.
    *       1
    *    /     \
    *   2      3
    * /  \
    * 4   5
    *
    * Note that the path must end on a leaf node. For example, the minimum
    * height of below Binary Tree is also 2.
    *     10
    *    /
    *  5
    * */

    public static void main(String[] args){
        //Root of the binary tree
       BinaryTree tree = new BinaryTree();
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);

       System.out.println("The minimum depth of binary tree is : " + minimumDepth(tree.root));

    }
    /*Function to calculate the minimum depth of the tree*/
    private static int minimumDepth(Node root){

        //Cornor case. should never be hit unless the code is called on root = NULL
        if(root == null){
            return 0;
        }

        //Base case: Leaf Node. This accounts for height = 1
        if(root.left == null && root.right == null){
            return 1;
        }

        //If left subtree is NULL, recur for right subtress
        if(root.left == null){
            return minimumDepth(root.right) + 1;
        }

        if(root.right == null){
            return minimumDepth(root.left) + 1;
        }

        return Math.min(minimumDepth(root.left), minimumDepth(root.right))+1;
    }
}
