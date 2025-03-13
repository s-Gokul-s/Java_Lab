package java_prgrms;
import java.util.Scanner;

class Product {
    String pcode, pname;
    double price;

    Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Product[] products = new Product[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter product " + (i + 1) + " details:");
            System.out.print("Product Code: ");
            String pcode = scanner.next();
            System.out.print("Product Name: ");
            String pname = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            
            products[i] = new Product(pcode, pname, price);
        }
        
        Product minProduct = products[0];
        for (int i = 1; i < 3; i++) {
            if (products[i].price < minProduct.price) {
                minProduct = products[i];
            }
        }
        
        System.out.println("Product with the lowest price:");
        System.out.println("Code: " + minProduct.pcode + ", Name: " + minProduct.pname + ", Price: " + minProduct.price);
        
        scanner.close();
    }
}