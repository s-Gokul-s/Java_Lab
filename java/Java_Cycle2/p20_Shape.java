import java.util.Scanner;

// Interface
interface Shape {
    // Abstract method
    void calculateArea(); 
}

// Triangle Class implementing Shape
class Triangle implements Shape {
    double base, height;
    // Constructor for Triangle
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

// Rectangle Class implementing Shape
class Rectangle implements Shape {
    double length, width;
    // Constructor for rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

// Main Class
public class p20_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Triangle
        System.out.println("Enter Triangle dimensions:");
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        Shape triangle = new Triangle(base, height); 

        // Input for Rectangle
        System.out.println("\nEnter Rectangle dimensions:");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Width: ");
        double width = sc.nextDouble();
        Shape rectangle = new Rectangle(length, width); 

        triangle.calculateArea();
        rectangle.calculateArea();

        sc.close();
    }
}
