package oop.course;

public class OnlineCourse extends Course {
    private String platformName;
    private double duration;

    public OnlineCourse(String courseName, String instructorName, int credits, String platformName, double duration) {
        super(courseName, instructorName, credits);
        this.platformName = platformName;
        this.duration = duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Platform Name: " + platformName);
        System.out.println("Duration: " + duration);
    }

    @Override
    public boolean eligibleCert() {
        return duration >= 140;
    }
}
