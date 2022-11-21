package Sudhanshu;



                         //Question number 8.



import java.util.Scanner;

public class LeapYear {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if (number%4==0) {
			System.out.println("This year is a Leap year.");
			
		}
		else {
			System.out.println("This year is not a Leap year.");
		}
	}

}
