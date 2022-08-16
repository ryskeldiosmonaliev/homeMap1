package com.company;

public class Danye {
    private int year;
    private String model;
    private int paymet;
    private String color;

    public Danye(int year, String model, int paymet, String color) {
        this.year = year;
        this.model = model;
        this.paymet = paymet;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPaymet() {
        return paymet;
    }

    public void setPaymet(int paymet) {
        this.paymet = paymet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Danye{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", paymet=" + paymet +
                ", color='" + color + '\'' +
                '}';
    }
}
