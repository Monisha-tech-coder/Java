package learn.abstraction;

public class AbstractBank extends Abstraction {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	public static void main(String args[])
	{
		Abstraction a=new AbstractBank();
		System.out.println("abstract method");
		a.myMethod();
	}

}
