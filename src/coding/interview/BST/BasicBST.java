package coding.interview.BST;

import java.util.ArrayList;

public class BasicBST {
    Node root;
    public BasicBST(){
        root = null;
    }
    public BasicBST(int key){
        root = new Node(key);
    }
    static ArrayList<Node> nodeList = new ArrayList<Node>();

    public static void main(String[] args){
        BasicBST tree = new BasicBST();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);
        int search = 22;
        System.out.println("Find a value of "+ search +" in BST: " + ((search(search, tree.root)== null)? "Value not found.":"Value found."));
        int insertValue = 30;
        System.out.println("Insert value of "+ insertValue+ "in BST: " + insert(insertValue, tree.root));
        search = insertValue;
        System.out.println("Find a value of "+ search +" in BST: " + ((search(search, tree.root)== null)? "Value not found.":"Value found."));

        System.out.println("New bst!");
        BasicBST bst = new BasicBST(50);
        insertANode(30,bst.root);
        insertANode(70,bst.root);
        insertANode(20,bst.root);
        insertANode(40,bst.root);
        insertANode(60,bst.root);
        insertANode(80,bst.root);

        inOrderTraversal(bst.root);
        System.out.println("Delete 50");
        Node treeAfter = deleteAT(50,bst.root);
        inOrderTraversal(treeAfter);

    }

    private static Node deleteAT(int value, Node node){

        listOfNodes(node); //O(n)
        //Find the value
        int indexDel = findTobeDeleted(value,node);//O(n)
        Node tobeDelete = nodeList.get(indexDel);
        //find successor
        Node predecessor = nodeList.get(indexDel-1);
        Node successor = nodeList.get(indexDel+1);

        //To be deleted node is a leaf
        if(tobeDelete.left == null && tobeDelete.right == null){
            tobeDelete = null;
        }
        else if(tobeDelete.right == null){
            tobeDelete = node.left;
        }
        else if(tobeDelete.left == null){
            tobeDelete = node.right;
        }

        //rearrange the subtree of successor
        tobeDelete.key = successor.key;
        if(successor.right != null){
            predecessor.left = successor.right;
        }
        return node;
    }
    private static Node search(int val, Node node){
        //Not found condition
        if(node == null){
            return node;
        }

        //check with root value
        if(node.key== val){
            return node;
        }
        if(node.key > val){
           return search(val, node.left);
        }
        if(node.key<val){
            return search(val,node.right);
        }

        return null;
    }

    private static Node insertANode(int value, Node node){

        if(node == null){
            node = new Node(value);
            return node;
        }
        if(node.key == value){
            return node;
        }
        if(node.key > value){
            node.left = insertANode(value,node.left);
        }
        else{
            node.right = insertANode(value,node.right);
        }
        return node;
    }

    private static boolean insert(int value, Node node){
        //value already exist
        if(node == null || node.key ==value){
            return false;
        }

        if(node.key > value){
            if(node.left == null){
                node.left = new Node(value);
                return true;
            }
            else{
                return insert(value,node.left);
            }
        }

        if(node.key < value ){
            if(node.right == null) {
                node.right = new Node(value);
                return true;
            }
            else{
                return insert(value,node.right);
            }
        }
        return false;
    }

    private static void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.println(node.key);
            inOrderTraversal(node.right);
        }

    }
    private static void preOrderTraversal(Node node){
        if(node == null) return;
        System.out.println(node.key);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    private static void postOrderTraversal(Node node){
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.key);
    }
    private static int findTobeDeleted(int value, Node node){
        for(Node n: nodeList){
            if(n.key == value){
                return nodeList.indexOf(n);
            };
        }
        return -1;
    }

    private static void listOfNodes(Node node){

        if(node != null){
            inOrderTraversal(node.left);
            nodeList.add(node);
            inOrderTraversal(node.right);
        }
    }
}
