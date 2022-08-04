package learn.abstraction;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Circle extends Shape
{
	double radius;
	
	public Circle(String color,double radius) {
		super(color);
		System.out.println("circle constructor");
		this.radius=radius;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("circle color is "+ getColor() +" and area of circle is "+area());
		
	}
	
}
	
	


