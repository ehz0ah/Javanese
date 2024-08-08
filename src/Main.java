import oop.*;
import oop.vehicle.Car;
import oop.vehicle.Truck;
import oop.vehicle.Vehicle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
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
        */
        Vehicle car = new Car("Suzuki", "Swift", 2002, 265);
        Vehicle truck = new Truck("Ford", "F-150", 2000, 3315);
        car.display();
        truck.display();
    }
}
