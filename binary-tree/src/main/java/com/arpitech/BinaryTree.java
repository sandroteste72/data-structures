package com.arpitech;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert (T contents) {
        BinaryNode<T> newNode = new BinaryNode<>(contents);
        root = insert(root, newNode);
    }

    private BinaryNode<T> insert (BinaryNode<T> current, BinaryNode<T> newNode) {

        if (current == null) {
            return newNode;
        }
        else if (newNode.getContents().compareTo(current.getContents()) < 0) {
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        }
        else {
            current.setRightNode(insert(current.getRightNode(), newNode));
        }
        return  current;
    }

    public void displayInOrder() {
        System.out.println("\n Displaying InOrder");
        displayInOrder(this.root);
    }

    private void displayInOrder(BinaryNode<T> current) {
        if (current != null) {
            displayInOrder(current.getLeftNode());
            System.out.print(current.getContents() + ", ");
            displayInOrder(current.getRightNode());
        }
    }

    public void displayPostOrder() {
        System.out.println("\n Displaying PostOrder");
        displayPostOrder(this.root);
    }

    private void displayPostOrder(BinaryNode<T> current) {
        if (current != null) {
            displayPostOrder(current.getLeftNode());
            displayPostOrder(current.getRightNode());
            System.out.print(current.getContents() + ", ");
        }
    }

    public void displayPreOrder() {
        System.out.println("\n Displaying PreOrder");
        displayPreOrder(this.root);
    }

    private void displayPreOrder(BinaryNode<T> current) {
        if (current != null) {
            System.out.print(current.getContents() + ", ");
            displayPreOrder(current.getLeftNode());
            displayPreOrder(current.getRightNode());
        }
    }

    public void remove(T contents) {
        try {
            BinaryNode<T> current = this.root;
            BinaryNode<T> parent = null;
            BinaryNode<T> child = null;
            BinaryNode<T> temp = null;

            while (current != null && !current.getContents().equals(contents)) {
                parent = current;
                if (contents.compareTo(current.getContents()) < 0) {
                    current = current.getLeftNode();
                } else {
                    current = current.getRightNode();
                }
            }

            if (current == null) {
                System.out.println("Contents not fount! Try block");
            }

            if (parent == null){
                if (current.getRightNode() == null) {
                    this.root = current.getLeftNode();
                } else if (current.getLeftNode() == null) {
                    this.root = current.getRightNode();
                } else {
                    for (temp = current, child = current.getLeftNode();
                        child.getRightNode() != null;
                        temp = child, child = child.getLeftNode()) {
                        if (child != child.getLeftNode()) {
                            temp.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }
                    }
                    child.setRightNode(root.getRightNode());
                    root = child;
                }
            } else if (current.getRightNode() == null) {
                if (parent.getLeftNode() == current) {
                    parent.setLeftNode(current.getLeftNode());
                } else {
                    parent.setRightNode(current.getLeftNode());
                }
            } else if (current.getLeftNode() == null) {
                if (parent.getLeftNode() == current) {
                    parent.setLeftNode(current.getRightNode());
                } else {
                    parent.setRightNode(current.getRightNode());
                }
            } else {
                for (temp = current, child = current.getLeftNode(); child.getRightNode() != null; temp = child, child = child.getRightNode()) {
                    if (child != current.getLeftNode()) {
                        temp.setRightNode(child.getLeftNode());
                        child.setLeftNode(current.getLeftNode());
                    }
                    child.setRightNode(current.getRightNode());
                    if (parent.getLeftNode() == current) {
                        parent.setLeftNode(child);
                    } else {
                        parent.setRightNode(child);
                    }
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Contents not found! Catch block");
        }
    }
}
