import java.util.Scanner;
public class p3_admission {
	public static void main(String[] args) {
		// Add the Marks
		Scanner sc = new Scanner(System.in);

		System.out.println("Eligibility Check ");
		System.out.println("Enter the marks for Maths : ");
		double mat = sc.nextDouble();

		System.out.println("Enter the marks for	 Physics: ");
		double phy = sc.nextDouble();

		System.out.println("Enter the marks for Chemistry : ");
		double chem = sc.nextDouble();

		double total_three = mat + phy + chem ; 
		double total_two = mat + phy;

		System.out.println("Marks for Total Three: " + total_three);
		System.out.println("Marks for Maths and Physics : " + total_two);
		
		// Check the 2 condition using or operator 
		if(mat>=60 && phy>=50 && chem>=40 && total_three>=200 || total_two>=150) {
			System.out.println("Eligibility check passed");
		}
		else {
			System.out.println("Eligibility check failed");
		}
		sc.close();
	}
}