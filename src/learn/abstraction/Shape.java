package learn.abstraction;


abstract class Shape{
	String color;
	abstract double area();//abstract method
public Shape(String color) //constructor
	{
	this.color=color;
		System.out.println("constructor is called");
}
	public abstract String toString();
	public String getColor() //non abstract method
	{
		return color;
	}
}
