package oop.vehicle;

public class Vehicle {
    protected String maker;
    protected String model;
    protected int year;

    public Vehicle(String maker, String model, int year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    public String getMaker() {
        return this.maker;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void display() {
        System.out.println("Maker: " + this.maker);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}
