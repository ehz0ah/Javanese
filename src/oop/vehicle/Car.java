package oop.vehicle;

public class Car extends Vehicle {
    private double size;

    public Car(String maker, String model, int year, double size) {
        super(maker, model, year);
        this.size = size;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Trunk Size: " + size + "litres");
    }
}
