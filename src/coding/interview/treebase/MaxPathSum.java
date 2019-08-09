package coding.interview.treebase;

public class MaxPathSum {
    /* https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/ */
    /*
    Given a binary tree, find the maximum path sum. The path may start and end
    at any node in the tree.
    Example:
             1
            / \
           2   3
        MaxSum =1+2+3 = 6
    */

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);

        int maxSum = findMaxSum(tree.root);
        System.out.println("Sum of Max path: "+ maxSum);
    }
    private static int findMaxSum(Node node){
        return node.key + maxSumSubtree(node.left)+ maxSumSubtree(node.right);
    }

    private static int maxSumSubtree(Node node){
        if(node == null){
            return 0;
        }
        if(node.left== null && node.right == null){
            return node.key;
        }
        if(node.left==null){
            int subSum = maxSumSubtree(node.right);
            return (subSum > 0)? node.key + subSum: node.key;
        }
        if(node.right == null){
            int subSum = maxSumSubtree(node.left);
            return (subSum > 0)? node.key + subSum: node.key;
        }
        return (Math.max(maxSumSubtree(node.left), maxSumSubtree(node.right)) > 0) ? node.key+ Math.max(maxSumSubtree(node.left), maxSumSubtree(node.right)):node.key;

    }
}
