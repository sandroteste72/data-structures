package com.arpitech;

public class Queue {

    private Node nodeReferenceQueueEntry;

    public Queue() {
        this.nodeReferenceQueueEntry = null;
    }

    public boolean isEmpty() {
        return nodeReferenceQueueEntry == null ? true : false;
    }

    public void enqueue(Node newNode) {
        newNode.setNodeReference(nodeReferenceQueueEntry);
        nodeReferenceQueueEntry = newNode;
    }

    public Node first() {
        if (!isEmpty()) {
            Node firstNode = nodeReferenceQueueEntry;
            while (true) {
                if (firstNode.getNodeReference() != null) {
                    firstNode = firstNode.getNodeReference();
                }
                else {
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node dequeue() {
        if (!isEmpty()) {
            Node firstNode = nodeReferenceQueueEntry;
            Node auxiliaryNode = nodeReferenceQueueEntry;
            while (true) {
                if (firstNode.getNodeReference() != null) {
                    auxiliaryNode = firstNode;
                    firstNode = firstNode.getNodeReference();
                }
                else {
                    auxiliaryNode.setNodeReference(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node auxiliaryNode = nodeReferenceQueueEntry;

        if (nodeReferenceQueueEntry != null) {
            while (true) {
                stringReturn += "[Node {object = " + auxiliaryNode.getObject() + "}]--->";
                if (auxiliaryNode.getNodeReference() != null) {
                    auxiliaryNode = auxiliaryNode.getNodeReference();
                }
                else {
                    stringReturn += "null";
                    break;
                }
            }
        }
        else {
            stringReturn = "null";
        }

        return stringReturn;
    }
}
