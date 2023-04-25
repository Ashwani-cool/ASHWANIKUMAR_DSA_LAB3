package pairsumbinarytree.main;

import pairsumbinarytree.BinarySearchTree.BST;

public class Application {
    public static void main(String[] args){
        BST bstree = new BST();
        bstree.insert(40);
        bstree.insert(20);
        bstree.insert(60);
        bstree.insert(10);
        bstree.insert(30);
        bstree.insert(50);
        bstree.insert(70);
        bstree.findPair(bstree.root,120);
    }
}
