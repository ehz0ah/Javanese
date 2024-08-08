package side;

public class GradeHelper {
    public static void main(String[] args) {
        String grade = args[0];
        double gpa;
        switch (grade) {
            case "A+":
            case "A":
                gpa = 5.0;
                break;
            case "A-":
                gpa = 4.5;
                break;
            case "B+":
                gpa = 4.0;
                break;
            case "B":
                gpa = 3.5;
                break;
            case "B-":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.5;
                break;
            default:
                gpa = 0;
                break;
        }
        System.out.println("CAP for grade " + grade + " is " + gpa);
    }
}
