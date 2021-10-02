package com.arpitech;

public class LinkedList<T> {

    Node<T> inputReference;

    public LinkedList() {
        this.inputReference = null;
    }

    public boolean isEmpty() {
        return inputReference == null ? true : false;
    }

    public int size() {
        int listSize = 0;

        Node<T> auxReference = inputReference;

        while (true) {
            if (auxReference != null) {
                listSize++;
                if (auxReference.getNextNode() != null) {
                    auxReference = auxReference.getNextNode();
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }
        return listSize;
    }

    public void add(T contents) {
        Node<T> newNode = new Node<>(contents);
        if (isEmpty()) {
            inputReference = newNode;
            return;
        }

        Node auxNode = inputReference;
        for (int i = 0; i < size() - 1; i++) {
            auxNode = auxNode.getNextNode();
        }
        auxNode.setNextNode(newNode);
    }
}
