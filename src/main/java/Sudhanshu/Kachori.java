package Sudhanshu;



                          // Question number 9.

import java.util.Scanner;

public class Kachori {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money you have.");
		int x=sc.nextInt();
		
		int a=x;
		System.out.println("The price of Notebook 1 is : "+a);
		
		int b=x-30;
		System.out.println("The price of Notebook 2 is : "+b);
		
		int c=x-50;
		System.out.println("The price of Notebook 3 is : "+c);
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter which Notebook you slected. ");
		int l=n.nextInt();
		
		if (l==1) {
			System.out.println("Kachori bhul jao...");
		}
		else if(l==2) {
			System.out.println(" kha skte ho kachori..");
			
		}
		else if (l==3) {
			System.out.println("pet bhar ke kha skte ho bhai kachori..");
		}
        
		
		
		
		
	}

}
