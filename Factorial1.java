package javaday3;

import java.util.Scanner;

public class Factorial1 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter the number");
	
	int n = scan.nextInt();
	
	int lastdigit;
	
	while(n>0)
	{
		lastdigit = n%10;
		
		int fact=1;
		for(int i=1;i<=lastdigit;i++)
		{
			fact*=i;
			
		}
		System.out.println("factorial of "+lastdigit+" is :"+fact);
		n=n/10;
	}
	
	

}
}