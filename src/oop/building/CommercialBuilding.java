package oop.building;

public class CommercialBuilding extends Building {
    private double commercialSpace;
    private double rentPerMetreSquare;

    public CommercialBuilding(String address, int floors, double area, double commercialSpace, double rentPerMetreSquare) {
        super(address, floors, area);
        this.commercialSpace = commercialSpace;
        this.rentPerMetreSquare = rentPerMetreSquare;
    }

    public double getRent() {
        return commercialSpace * rentPerMetreSquare;
    }
}
