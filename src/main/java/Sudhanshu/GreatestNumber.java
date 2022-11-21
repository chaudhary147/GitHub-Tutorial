package Sudhanshu;




                              //Question number 7.
import java.util.Scanner;

public class GreatestNumber {
	public static void main(String []args) {
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the number");
	              int x=q.nextInt();
	 Scanner w=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int y=w.nextInt();
		 
		 Scanner t=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int z=t.nextInt();
		 if(x>y || x>z) {
			 System.out.println("X is the greatest integer.");
		 }
		 else if(y>x || y>z) {
			 System.out.println("Y is the greatest integer.");
			 
		 }
		 else if (z>x || z>y) {
			 System.out.println("Z is the greatest integer.");
		 }
		 
	}

}
