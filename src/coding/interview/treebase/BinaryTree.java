package coding.interview.treebase;

public class BinaryTree {
    /*
     A tree whose elements have at most 2 children is called a binary tree.
     Since each element in a binary tree can have only 2 children, we typically
     name them the left and right child.
     [Why Binary Tree?]
     1. to store information that naturally forms a hierarchy
     2. Trees provide moderate access/search (quicker than
        Linked List and slower than arrays).
     3. Trees provide moderate insertion/deletion (quicker than
        Arrays and slower than Unordered Linked Lists).
     4. Like Linked Lists and unlike Arrays, Trees don’t have an
        upper limit on number of nodes as nodes are linked using pointers.
    */

    /*
    Properties
     Q. Height, Depth, Level
     A. http://typeocaml.com/2014/11/26/height-depth-and-level-of-a-tree/
                A
             /    \
           B        C
        /   \     /  \
       G  null   D    F
               /  \
              E   null

     Height: Longest DOWNWARD path between that node and a leaf (Base line = leaf)
             Leaf cannot have height.
         A's height = 3
         B's height = 1

     Depth: The number of edges from the node to the tree's root node (Base line = root)
       A's depth = 0
       B's depth = 1
       D's depth = 2

     Level: Level = Depth +1

     1. Maximum number of nodes on level 'l' =>  2^(l-1)
       ex)) Num of nodes on root = 2^1-1 = 1
       ex)) Num of nodes on level 2 = 2^2-1 = 2
     2. Max num of nodes in a binary tree of height 'h' => (2^h)-1
     3. In a Binary Tree with N nodes, minimum possible height or minimum number of levels is? Log2(N+1) -1
     4.
    */

    /* Traversal - Time Complexity: O(n)
       1) Inorder traversal
          Left -> Root -> Right
       2) Preorder traversal
          Root -> Left -> Right
       3) Postorder
          Left -> Right -> Root

    */
    //Root of Binary Tree
    Node root;
    BinaryTree(){
        root = null;
    }
    BinaryTree(int key){
        root = new Node(key);
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        //Create root
        tree.root = new Node(1);
        //Following is the tree after above statement
        /*
        *     1
        *  /    \
        * null  null */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        //2 and 3 become left and right children of node 1
        /*
         *            1
         *       /          \
         *       2            3
         *    /     \       /  \
         *   4         5  null null
         * /  \      /   \
         *null null null null */

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder(Root,l,r) traversal of binary tree is est 1,2,4,5,3 ");
        printPreOrder(tree.root);

        System.out.println("\nInorder(L,root,R) traversal of binary tree is est 4,2,5,1,3");
        printInOrder(tree.root);

        System.out.println("\nPostorder(L,R,root) traversal of binary tree is est 4,5,2,3,1");
        printPostOrder(tree.root);

    }

    /*Given a binary tree, print its nodes according to the bottom-up postorder traversal*/
    private static void printPostOrder(Node node){
        if(node == null){
            return;
        }
        //first recur on left subtree
        printPostOrder(node.left);
        //then recur on right subtree
        printPostOrder(node.right);
        //now deal with the node
        System.out.println(node.key + " ");
    }

    /*Given a binary tree, print its nodes in inorder*/
    private static void printInOrder(Node node){
        if(node==null){
            return;
        }
        //first recur on left child
        printInOrder(node.left);
        //then print the data of the node
        System.out.println(node.key + " ");
        //lastly recur on right child
        printInOrder(node.right);
    }

    private static void printPreOrder(Node node){
        if(node == null){
            return;
        }
        //first print data of the node
        System.out.println(node.key + " ");
        //then recur on left subtree
        printPreOrder(node.left);
        //now recur on right subtree
        printPreOrder(node.right);
    }

}
