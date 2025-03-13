import java.util.Scanner;
public class p7_armstrong {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		System.out.println("The Number is " + num);
		int orgnum=num;
		int result=0,rem;
		while(num!=0) {
			rem=num%10;
			result += Math.pow(rem, 3);
			num=num/10;
		}
		if(orgnum==result) {
			System.out.println(" The Number is Armstrong");
		}
		else {
			System.out.println(" The Number is not Armstrong");
		}	
 
	}


}
