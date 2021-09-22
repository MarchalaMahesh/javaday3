package javaday3;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args)
	{
		
		int  digit;
		String rev="";
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		int number = sc.nextInt();  
		while(number > 0)  
		{  
		  
		digit = number % 10;  
		
		rev = rev+ digit;  
		
		number = number / 10;  
		}  
		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
