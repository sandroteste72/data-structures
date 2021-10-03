package com.arpitech;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.add("test4");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.remove(3));
        System.out.println(myLinkedList);
    }
}
