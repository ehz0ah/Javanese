package oop.vehicle;

public class Truck extends Vehicle {
    private double capacity;

    public Truck(String maker, String model, int year, double capacity) {
        super(maker, model, year);
        this.capacity = capacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Capacity: " + capacity + "lbs");
    }
}
