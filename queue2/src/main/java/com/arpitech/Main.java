package com.arpitech;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Car> queueCar = new LinkedList<>();

        queueCar.add(new Car("Ford"));
        queueCar.add(new Car("Chevrolet"));
        queueCar.add(new Car("Fiat"));

        System.out.println(queueCar.add(new Car("Peugeot")));
        System.out.println(queueCar);

        System.out.println(queueCar.offer(new Car("Renault")));
        System.out.println(queueCar);

        System.out.println(queueCar.peek());
        System.out.println(queueCar);

        System.out.println(queueCar.poll());
        System.out.println(queueCar);

        System.out.println(queueCar.isEmpty());

        System.out.println(queueCar.size());
    }
}
