package com.company;

public class Car {
    private int id;
    private int number;

    public Car(int id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car: "+id+" номер машины: "+number;
    }
}
