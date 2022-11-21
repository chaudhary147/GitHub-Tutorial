package Sudhanshu;




              // Question NUmber 5.
import java.util.Scanner;

public class Average {
	public static void main(String[]args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=v.nextInt();
		
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the number");
		int b=f.nextInt();
		
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the number");
		int c=k.nextInt();
		
		Scanner l=new Scanner(System.in);
		System.out.println("Enter the number");
		int d=l.nextInt();
		
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the number");
		int e=p.nextInt();
		
		int x=a+b+c+d+e;
		int p1=x/5;
		System.out.println("The Average of 5 numbers: "+p1);
		
		
	}

}
