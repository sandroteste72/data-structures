package com.arpitech;

public class Node<T> {
    private T contents;
    private Node<T> nextNode;

    public Node(T contents) {
        this.nextNode = null;
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "contents='" + contents + '\'' +
                '}';
    }
}
