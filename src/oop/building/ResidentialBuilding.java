package oop.building;

public class ResidentialBuilding extends Building {
    private int totalApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int floor, double area, int totalApartments, double rentPerApartment) {
        super(address, floor, area);
        this.totalApartments = totalApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double getRent() {
        return totalApartments * rentPerApartment;
    }
}
