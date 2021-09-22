package javaday3;

import java.util.Scanner;

public class PerfectNumberOrNot {
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int n=scan.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				
				
			}
			
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println("number is perfect ");
		}
		else
		{
			System.out.println("number is not perfect ");
		}
		
	}

}
