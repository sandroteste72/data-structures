package com.arpitech;

public class Node {

    private Object object;
    private Node nodeReference;

    public Node() {
    }

    public Node(Object object) {
        this.nodeReference = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNodeReference() {
        return nodeReference;
    }

    public void setNodeReference(Node nodeReference) {
        this.nodeReference = nodeReference;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
