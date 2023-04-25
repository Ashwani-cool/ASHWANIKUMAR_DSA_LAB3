package pairsumbinarytree.BinarySearchTree;

import java.util.HashSet;

public class BST {
    public Node root;
    public BST(){
        root=null;
    }
    public void insert(int data){
        root = insertInBST(root,data);
    }
    Node insertInBST(Node root, int data){
        if(root==null)
        {
            root = new Node(data);
        }
        if(data < root.data){
            root.left=insertInBST(root.left,data);
        }else if (data > root.data)
            root.right = insertInBST(root.right, data);

        return root;
    }
    boolean isPairPresent(Node root,int sum,HashSet<Integer> set){
        if (root==null){
            return false;
        }

        if (isPairPresent(root.left,sum,set)){
            return true ;
        }
        if (set.contains(sum - root.data)){
            System.out.println("Pair is found (" + (sum - root.data) + ", " + root.data + ")!!");
            return true;
        }
        else set.add(root.data);

        return isPairPresent(root.right,sum,set);
    }
    public void findPair(Node root,int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        if(! isPairPresent(root,sum,set)){
            System.out.print("Pair do not exit!!");
        }
    }
}
