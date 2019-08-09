package coding.interview.treebase;

public class SumAllNodes {
    /* https://www.geeksforgeeks.org/sum-nodes-binary-tree/ */

    Node root;
    SumAllNodes(){
        root= null;
    }
    SumAllNodes(int key){
        root= new Node(key);
    }

    public static void main(String[] args){
        SumAllNodes tree = new SumAllNodes();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);

        System.out.println("Sum of the tree: " + findSum(tree.root));

    }

    private  static int findSum(Node node){
        if(node == null){
            return 0;
        }
        //Leaf
        if(node.left == null && node.right == null){
            return node.key;
        }
        //if left child is null
        if(node.left == null){
            return node.key +findSum(node.right);
        }

        //if right child is null
        if(node.right == null){
            return node.key + findSum(node.left);
        }
        //if both are not null
        return node.key + findSum(node.left)+ findSum(node.right);
    }
}
