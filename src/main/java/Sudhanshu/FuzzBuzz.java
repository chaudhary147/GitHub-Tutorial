package Sudhanshu;





                               //Question number 3.
import java.util.Scanner;
public class FuzzBuzz {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		if(number%3==0) {
			System.out.println("FUZZ");
		}
		else if(number%2==0) {
			System.out.println("BUZZ");
		}
		else if(number%6==0) {
			System.out.println("FUZZ BUZZ");
		}
	}

}
