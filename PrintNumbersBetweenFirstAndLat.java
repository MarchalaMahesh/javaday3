package javaday3;

import java.util.Scanner;

public class PrintNumbersBetweenFirstAndLat {
	public static void main(String[] args)
	
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a first number");
		int n1 = scan.nextInt();
		
		System.out.println("enter a last number");
		int n2 = scan.nextInt();
		
		if(n1<n2 && n1>0 && n2>0)
		{
			for(int i=n1+1;i<=n2-1;i++)
			{
				System.out.println("the numbers betwen "+n1+" and "+n2+" is :"+i);
			}
		}
		
		
		
		
		
	}

}
