package oop.course;

public class Course {
    private String courseName;
    private String instructorName;
    private int credits;

    public Course(String courseName, String instructorName, int credits) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.credits = credits;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public int getCredits() {
        return this.credits;
    }

    public void display() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Instructor Name: " + this.instructorName);
        System.out.println("Credits: " + this.credits);
    }

    public boolean eligibleCert() {
        return false;
    }
}
