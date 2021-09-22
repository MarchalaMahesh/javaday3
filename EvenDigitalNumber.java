package javaday3;

import java.util.Scanner;

public class EvenDigitalNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int n = scan.nextInt();
		
		
		int lastdigit=0;
		while(n>0)
		{
			lastdigit = n%10;
			
			if(lastdigit%2==0)
			{
				System.out.println("even numbers are :"+lastdigit);
			}
			n=n/10;
			
			
		}
		
		
		
	}
	

}
