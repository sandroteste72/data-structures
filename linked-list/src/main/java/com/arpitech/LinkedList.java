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

    public T get(int index) {
        return getNode(index).getContents();
    }

    private Node<T> getNode(int index) {
        validatesIndex(index);
        Node<T> auxNode = inputReference;
        Node<T> returnNode = null;

        for (int i = 0; i <= index; i++) {
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return returnNode;
    }

    public T remove(int index) {
        Node<T> nodePivot = this.getNode(index);
        if (index == 0) {
            inputReference = nodePivot.getNextNode();
            return nodePivot.getContents();
        }
        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(nodePivot.getNextNode());
        return nodePivot.getContents();
    }

    private void validatesIndex(int index) {
        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("There is no content in the  " + index + " index of this list. This list only goes to index " + lastIndex + ".");
        }
    }

    @Override
    public String toString() {
        String strReturn = "";
        Node<T> auxNode = inputReference;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "[Node {" +
                    "contents=" + auxNode.getContents() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        strReturn += "null";
        return strReturn;
    }
}
