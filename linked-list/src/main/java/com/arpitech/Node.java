package com.arpitech;

public class Node<T> {

    private T contents;
    private Node nextNode;

    public Node() {
        this.nextNode = null;
    }

    public Node(T contents) {
        this.nextNode = null;
        this.contents = contents;
    }

    public Node(T contents, Node nextNode) {
        this.contents = contents;
        this.nextNode = nextNode;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "contents=" + contents +
                '}';
    }

    public String toStringChained() {
        String str = "Node{" +
                "contents=" + contents +
                '}';

        if (nextNode != null) {
            str += "->" + nextNode.toString();
        }
        else {
            str += "->null";
        }
        return str;
    }
}
