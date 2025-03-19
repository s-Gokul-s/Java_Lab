import java.util.Scanner;

public class p10_Rectangle {
    double length;
    double width;
    //Constructor
    p10_Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    //Area
    void Area() {
        double ar = length * width;  
        System.out.println("Area: " + ar);
    }
    //Perimeter
    void Perimeter() {
        double per = 2 * (length + width);
        System.out.println("Perimeter: " + per);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        // Create object
        p10_Rectangle rect = new p10_Rectangle(length, width);
        rect.Area();
        rect.Perimeter();
        sc.close(); 
    }
}
