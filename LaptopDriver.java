package javaday3;

import java.util.Scanner;

public class LaptopDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter laptop name");
		String name = scan.next();
		
		System.out.println("enter laptop color");
		String color = scan.next();
		
		
		System.out.println("enter laptop id");
		int id = scan.nextInt();
		
		System.out.println("enter laptop price");
		int price = scan.nextInt();
		
		Laptop l1 = new Laptop(name,color,id,price);
		Laptop l2 = new Laptop(name);
		Laptop l3 = new Laptop(name,color);
		l1.printDetails();
		l2.printDetails();
		l3.printDetails();
		
		
		
	}
	

}
