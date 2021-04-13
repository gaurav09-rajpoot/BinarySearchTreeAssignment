package main;

import implementation.MyBinarySearchTree;
import myinterface.BinarySearchTreeADT;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(45);
        tree.insert(55);
        tree.insert(40);
        tree.insert(25);
        tree.insert(35);
        tree.insert(20);
        tree.insert(65);
        tree.preOrder(tree.getRoot());
        tree.postOrder(tree.getRoot());
        tree.inOrder(tree.getRoot());
    }
}
