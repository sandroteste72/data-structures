package com.arpitech;

public class Queue {

    private Node nodeReferenceQueueEntry;

    public Queue() {
        this.nodeReferenceQueueEntry = null;
    }

    public boolean isEmpty() {
        return nodeReferenceQueueEntry == null ? true : false;
    }

    public void enqueue(Object obj) {
        Node newNode = new Node(obj);
        newNode.setNodeReference(nodeReferenceQueueEntry);
        nodeReferenceQueueEntry = newNode;
    }

    public Object first() {
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
            return firstNode.getObject();
        }
        return null;
    }

    public Object dequeue() {
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
            return firstNode.getObject();
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
