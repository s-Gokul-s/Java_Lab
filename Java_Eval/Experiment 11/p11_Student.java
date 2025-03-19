import java.util.Scanner;

public class p11_Student {
    int studentId;
    String name;
    double marks;
    // Constructor
    p11_Student(int id, String n, double m) {
        studentId = id;
        name = n;
        marks = m;
    }
    //Student Details
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    // Check Mark
    void isPassed() {
        if (marks >= 40) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        // Create Object
        p11_Student student = new p11_Student(id, name, marks);
        student.displayDetails();
        student.isPassed();
        sc.close();
    }
}
