package com.arpitech;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert (T contents) {
        BinaryNode<T> newNode = new BinaryNode<>(contents);
        root = insert(root, newNode);
    }

    private BinaryNode<T> insert (BinaryNode<T> current, BinaryNode<T> newNode) {

        if (current == null) {
            return newNode;
        }
        else if (newNode.getContents().compareTo(current.getContents()) < 0) {
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        }
        else {
            current.setRightNode(insert(current.getRightNode(), newNode));
        }
        return  current;
    }
}
