package com.arpitech;

public class DoubleNode<T> {

    private T contents;
    private DoubleNode<T> nextNode;
    private DoubleNode<T> previousNode;

    public DoubleNode(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public DoubleNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "contents=" + contents +
                '}';
    }
}
