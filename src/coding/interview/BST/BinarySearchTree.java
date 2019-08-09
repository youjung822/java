package coding.interview.BST;

// Java program to demonstrate insert operation in binary search tree
public class BinarySearchTree {
    /* https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/ */
    Node root;
    //Construct
    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int val){
        root = new Node(val);
    }

    //This method mainly calls deleteRec()
    void deleteKey(int key){
        /*
        * Time Complexity: The worst case time complexity of delete operation is O(h)
        * where h is height of Binary Search Tree. In worst case, we may have to travel
        * from root to the deepest leaf node. The height of a skewed tree may become n
        * and the time complexity of delete operation may become O(n)
        * */
        root = deleteRec(root,key);
    }
    // A recursive function to insert a new key in BST
    Node deleteRec(Node root, int key){
        //Base case: If the tree is empty
        if(root == null) return root;

        //Otherwise recur down the tree
        if(key < root.key){
            root.left = deleteRec(root.left,key);
        }
        else if(key> root.key){
            root.right = deleteRec(root.right, key);
        }

        //if key is same as root's key, then This is the node to be deleted
        else{
            //node with only one child or no child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //node with two children: Get the inorder successor(smallest in the right subtree)
            root.key = minValue(root.right);

            //Delete the inorder successor
            root.right = deleteRec(root.right,root.key);
        }
        return root;
    }

    int minValue(Node root){
        int minv = root.key;
        while(root.left != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    //This method mainly calls insertRec();
    void insert(int key){
        root = insertRec(root,key);
    }
    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key){
        //If the tree is empty, return a new node
        if(root == null){
            root = new Node(key);
            return root;
        }

        //Otherwise, recur down the tree
        if(key<root.key){
            root.left = insertRec(root.left,key);
        }
        if(key> root.key){
            root.right = insertRec(root.right,key);
        }
        // return the unchanged node pointer
        return root;
    }

    //This method mainly calls InorderRec()
    void inorder(){
        inorderRec(root);
    }

    //A utility function to do inorder traversal of BST
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    //Driver program to test above functions
    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

        tree.deleteKey(30);
        System.out.println("After delete 30.");
        tree.inorder();
    }
}
