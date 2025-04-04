import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Calculate salary
    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee {
    double monthlySalary;
    // Constructor
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); //Constructor chaining
        this.monthlySalary = monthlySalary;
    }
    
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    // Constructor
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id); //Constructor Chaining
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class p12_EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Full-time employee input
        System.out.println("Enter Full-Time Employee details:");
        System.out.print("Name: ");
        String fullName = sc.nextLine();
        System.out.print("ID: ");
        int fullId = sc.nextInt();
        System.out.print("Monthly Salary: ");
        double monthlySalary = sc.nextDouble();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(fullName, fullId, monthlySalary);

        // Part-time employee input
        sc.nextLine(); // consume newline
        System.out.println("\nEnter Part-Time Employee details:");
        System.out.print("Name: ");
        String partName = sc.nextLine();
        System.out.print("ID: ");
        int partId = sc.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = sc.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = sc.nextInt();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(partName, partId, hourlyRate, hoursWorked);

        // Display details and salary
        System.out.println("\nFull-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());

        sc.close();
    }
}