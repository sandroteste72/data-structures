package com.arpitech;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Ford"));
        carList.add(new Car("Chevrolet"));
        carList.add(new Car("Volkswagen"));

        System.out.println(carList.contains(new Car("Ford")));
        System.out.println(new Car("Ford").hashCode());

        Car car1 = new Car("Ford");
        Car car2 = new Car("Chevrolet");

        System.out.println(car1.equals(car2));
    }
}
