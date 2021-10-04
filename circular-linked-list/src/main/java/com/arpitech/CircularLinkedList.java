package com.arpitech;

public class CircularLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public int size() {
        return this.listSize;
    }

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    public T get(int index) {
        return this.getNode(index).getContents();
    }

    private Node<T> getNode(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The list is empty!");
        }
        if (index == 0) {
            return this.tail;
        }
        Node<T> auxNode = this.tail;
        for (int i = 0; (i < index) && (auxNode != null); i++) {
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }

    public void remove(int index) {
        if (index >= listSize) {
            throw new IndexOutOfBoundsException("Index is larger than list size!");
        }
        Node<T> auxNode = this.tail;
        if (index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        }
        else if (index == 1) {
            this.tail.setNextNode(this.tail.getNextNode());
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public void add(T contents) {
        Node<T> newNode = new Node<>(contents);
        if (this.listSize== 0) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        }
        else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    @Override
    public String toString() {
        String strReturn = "";
        Node<T> auxNode = this.tail;
        for(int i = 0; i < size(); i++){
            strReturn += "[No{contents=" + auxNode.getContents() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        strReturn += size() != 0 ? "(Returns to the beginning)" : "[]";
        return strReturn;
    }
}
