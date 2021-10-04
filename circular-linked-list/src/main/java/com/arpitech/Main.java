package com.arpitech;

public class Main {

    public static void main(String[] args) {

        CircularLinkedList<String> myCircularLinkedList = new CircularLinkedList<>();

        myCircularLinkedList.add("c0");
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.remove(0);
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add("c1");
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add("c2");
        myCircularLinkedList.add("c3");
        System.out.println(myCircularLinkedList);

        System.out.println(myCircularLinkedList.get(0));
        System.out.println(myCircularLinkedList.get(1));
        System.out.println(myCircularLinkedList.get(2));
        System.out.println(myCircularLinkedList.get(7));
        System.out.println(myCircularLinkedList.get(323));

        System.out.println("=====");
        for (int i = 0; i < 20; i++) {
            System.out.println(myCircularLinkedList.get(i));
        }
    }
}
