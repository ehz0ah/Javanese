package oop.shape;

public abstract class Shape {  // only Triangle and Circle, Rectangle is not included

    // Abstract method to get the area of the shape
    // This method must be implemented by any subclass of Shape
    public abstract double getArea();

    // Abstract method to get the perimeter of the shape
    // This method must be implemented by any subclass of Shape
    public abstract double getPerimeter();
}
