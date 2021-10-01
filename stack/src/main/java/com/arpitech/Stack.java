package com.arpitech;

public class Stack {

    private Node nodeReferenceStackInput;

    public Stack() {
        this.nodeReferenceStackInput = null;
    }

    public Node top() {
        return nodeReferenceStackInput;
    }

    public void push(Node newNode) {
        Node auxiliaryReference = nodeReferenceStackInput;
        nodeReferenceStackInput = newNode;
        nodeReferenceStackInput.setNodeReference(auxiliaryReference);
    }

    public Node pop() {
        if (!isEmpty()) {
            Node nodePopped = nodeReferenceStackInput;
            nodeReferenceStackInput = nodeReferenceStackInput.getNodeReference();
            return nodePopped;
        }
        return null;
    }

    public boolean isEmpty() {
        return (nodeReferenceStackInput == null) ? true : false;
    }

    @Override
    public String toString() {

        String stringReturn = "------------------\n";
        stringReturn += "      Stack\n";
        stringReturn += "------------------\n";

        Node auxiliaryNode = nodeReferenceStackInput;

        while (true) {
            if (auxiliaryNode != null) {
                stringReturn += "[Node {data = " + auxiliaryNode.getData() + "}]\n";
                auxiliaryNode = auxiliaryNode.getNodeReference();
            }
            else {
                break;
            }
        }
        stringReturn += "==================\n";
        return stringReturn;
    }
}
