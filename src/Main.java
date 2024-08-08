import oop.*;
import oop.building.CommercialBuilding;
import oop.building.ResidentialBuilding;
import oop.course.Course;
import oop.course.OnlineCourse;
import oop.event.MusicalPerformance;
import oop.event.Seminar;
import oop.shape.Circle;
import oop.shape.Shape;
import oop.shape.Triangle;
import oop.vehicle.Car;
import oop.vehicle.Truck;
import oop.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person John = new Person("John", 54);
        Person Bob = new Person("Bob", 22);
        System.out.println(John.getName());
        System.out.println(Bob.getName());
        John.setAge(39);
        System.out.println(John.getAge());

        Rectangle square = new Rectangle(40, 40);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        ArrayList<String> collection = new ArrayList<>();
        Book book1 = new Book("Maplestory", "Johnny King", collection);
        System.out.println(book1.getCollection());
        book1.addToCollection("Pirate King");
        book1.addToCollection("Harry Potter");
        System.out.println(book1.getCollection());

        ArrayList<Account> accounts = new ArrayList<Account>();
        Bank OCBC = new Bank(accounts, 0);
        Account account1 = new Account(1, "John", 2300.0);
        Account account2 = new Account(2, "Jane", 699999.0);
        OCBC.addAccount(account1);
        OCBC.addAccount(account2);
        System.out.println(OCBC.getTotal());
        OCBC.deposit(account1, 10000.0);
        System.out.println(OCBC.getTotal());
        for (Account account : accounts) {
            System.out.println(account.getOwnerName());
        }

        Employee employee1 = new Employee("Grock", 7800.0, LocalDate.parse("2024-08-08"));
        System.out.println(employee1.getYearsOfService());

        Shape circle = new Circle(5);
        Shape triangle = new Triangle(10, 15, 8);
        System.out.println("Circle's Area: " + circle.getArea() + ", Circle's Circumference: " + circle.getPerimeter());
        System.out.println("Triangle's Area: " + triangle.getArea() + ", Triangle's Perimeter: " + triangle.getPerimeter());

        Vehicle car = new Car("Suzuki", "Swift", 2002, 265);
        Vehicle truck = new Truck("Ford", "F-150", 2000, 3315);
        car.display();
        truck.display();

        Course CS1231 = new Course("CS1231", "Bob", 4);
        Course CS3244 = new OnlineCourse("CS3244", "Kilian", 4, "Udemy", 152.5);
        CS1231.display();
        CS3244.display();
        System.out.println(CS3244.eligibleCert());

        ResidentialBuilding Trilliant = new ResidentialBuilding("Tampines", 15, 1000.0, 1000, 1300);
        CommercialBuilding Giant = new CommercialBuilding("Tampines", 15, 5000.0, 6000, 2300);
        System.out.println(Trilliant.getRent());
        System.out.println(Giant.getRent());

        // Create different dates to avoid conflict
        // Create a date for testing
        Date date = new Date();

        // Create an instance of Seminar
        Seminar seminar = new Seminar("Space Conference", date, "Convention Center", 5);

        // Create an instance of MusicalPerformance
        ArrayList<String> performers = new ArrayList<String>();
        performers.add("Band A");
        performers.add("Band B");
        MusicalPerformance concert = new MusicalPerformance("Winter Fest", date, "Convention Center", performers);

        // Display details of the seminar
        System.out.println("Seminar Details:");
        seminar.displayDetails();

        // Display details of the musical performance
        System.out.println("\nMusical Performance Details:");
        concert.displayDetails();

        // Check for scheduling conflict
        if (seminar.isConflict(concert)) {
            System.out.println("\nConflict detected: Both events are scheduled at the same time and location.");
        } else {
            System.out.println("\nNo conflict: Events are scheduled at different times or locations.");
        }


    }
}
