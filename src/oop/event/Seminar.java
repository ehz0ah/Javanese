package oop.event;

import java.util.Date;

public class Seminar extends Event {
    int numberOfSpeakers;

    public Seminar(String eventName, Date date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}

