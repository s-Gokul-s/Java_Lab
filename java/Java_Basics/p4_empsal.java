import java.util.Scanner;
public class p4_empsal {
	public static void main(String[] args) {
		double salary = 0;
		Scanner sc = new Scanner(System.in);
		// Input the Role
		System.out.println("1-Manager \n2-Developer \n3-Intern");
		System.out.println("Enter your job role from above (1,2,3) : ");
		int role = sc.nextInt();

		System.out.println("Enter your year Experience : ");
		int yr = sc.nextInt();
		// Salary based on Role 
		switch(role) {
		case 1 : 
			salary = 50000;
			break;
		case 2 :
			salary = 30000;
			break;
		case 3 :
			salary = 15000;
			break;
		default:
            System.out.println("Invalid job role! Please enter 1, 2, or 3.");
            sc.close();
            return;
		}
		// Experience greater than orequal to 3 and less than or equal to 5 years
		if(yr>=3 && yr<=5) {
			salary = (salary*10)/100 + salary;
			System.out.println("Salary : "+ salary);
		}
		// Experience greater than 5 years
		else if(yr>5) {
			salary = (salary*20)/100 + salary;
			System.out.println("Salary : "+ salary);
		}
		// Experience less than 3 years
		else {
			System.out.println("Salary : "+ salary);
		}
	}
	
}