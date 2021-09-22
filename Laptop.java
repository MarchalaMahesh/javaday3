package javaday3;

public class Laptop {
	String name;
	String color;
	int id;
	int price;
	
	Laptop(String name)
	{
		this.name=name;
	}
	Laptop(String name,String color)
	{
		this(name);
		this.color=color;
	}
	Laptop(String name,String color,int id,int price)
	{
		this(name,color);
		
		this.id=id;
		this.price=price;
	}
	
	public void printDetails()
	{
		System.out.println("...............");
		System.out.println("laptop name :"+name);
		System.out.println("laptop colr :"+color);
		System.out.println("laptop id :"+id);
		System.out.println("laptop price :"+price);
	}

}
