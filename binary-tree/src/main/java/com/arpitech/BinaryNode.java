package com.arpitech;

public class BinaryNode<T extends Comparable<T>> {

    private T contents;
    private BinaryNode<T> leftNode;
    private BinaryNode<T> rightNode;

    public BinaryNode() {
    }

    public BinaryNode(T contents) {
        this.contents = contents;
        leftNode = rightNode = null;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public BinaryNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "contents=" + contents +
                '}';
    }
}
