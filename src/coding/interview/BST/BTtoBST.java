package coding.interview.BST;

import java.util.ArrayList;
import java.util.Collections;

public class BTtoBST {
    /* https://www.geeksforgeeks.org/binary-tree-to-binary-search-tree-conversion/ */

    Node root;
    //List of node in the tree
    private static ArrayList<Integer> nodeValueArrayList = new ArrayList<Integer>();
    public BTtoBST(){
        root = null;
    }

    public static void main(String[] args){
        BTtoBST tree = new BTtoBST();
        tree.root=new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(4);

        System.out.println("Binary Tree");
        inOrderTraversal(tree.root);

        createNodeList(tree.root);
        Collections.sort(nodeValueArrayList);

        System.out.println("Binary Search Tree");
        convertBTtoBST(tree.root);
        inOrderTraversal(tree.root);
    }

    //a helper function to count nodes in a binary tree
    private static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) +1;
    }


    private static void convertBTtoBST(Node root){
        if(root == null){
            return;
        }
        convertBTtoBST(root.left);
        root.key = nodeValueArrayList.get(0);
        nodeValueArrayList.remove(0);
        convertBTtoBST(root.right);
    }

    private static void createNodeList(Node root){
        if(root != null){
            createNodeList(root.left);
            nodeValueArrayList.add(root.key);
            createNodeList(root.right);
        }
    }
    private static void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.key);
            inOrderTraversal(root.right);
        }
    }
}
