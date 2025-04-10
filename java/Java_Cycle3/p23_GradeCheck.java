import java.util.Scanner;

class InvalidGradeException extends Exception {
    InvalidGradeException(String message) {
        super(message);
    }
}

public class p23_GradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's grade (A-F): ");
        char grade = scanner.next().charAt(0);

        try {
            if (grade < 'A' || grade > 'F') {
                throw new InvalidGradeException("Grade must be between A and F.");
            }
            System.out.println("Grade is valid: " + grade);
        } catch (InvalidGradeException e) {
            System.out.println("Invalid Grade: " + e.getMessage());
        }

        scanner.close();
    }
}
