package com.arpitech;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Car> carStack = new Stack<>();

        carStack.push(new Car("Ford"));
        carStack.push(new Car("Chevrolet"));
        carStack.push(new Car("Volkswagen"));
        carStack.push(new Car("Fiat"));

        System.out.println(carStack);
        System.out.println(carStack.pop());
        System.out.println(carStack);

        System.out.println(carStack.peek());
        System.out.println(carStack);

        System.out.println(carStack.empty());
    }
}
