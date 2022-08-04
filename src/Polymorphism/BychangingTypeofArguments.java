package Polymorphism;

public class BychangingTypeofArguments {

	static int add(int a, int b)
	{
		return a+b;
	}  
	static double add(double a, double b)
	{
	return a+b;
	}  
	
	class TestOverloading2{  
	public void main(String[] args){  
	System.out.println(BychangingTypeofArguments.add(11,11));  
	System.out.println(BychangingTypeofArguments.add(12.3,12.6));  
	}

}
}