package com.arpitech;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<String> myDoublyLinkedList = new DoublyLinkedList<>();

        myDoublyLinkedList.add("c1");
        myDoublyLinkedList.add("c2");
        myDoublyLinkedList.add("c3");
        myDoublyLinkedList.add("c4");
        myDoublyLinkedList.add("c5");
        myDoublyLinkedList.add("c6");
        myDoublyLinkedList.add("c7");

        System.out.println(myDoublyLinkedList);

        myDoublyLinkedList.remove(3);
        System.out.println(myDoublyLinkedList);
        myDoublyLinkedList.add(3, "99");

        System.out.println(myDoublyLinkedList);
        System.out.println(myDoublyLinkedList.get(3));
    }
}
