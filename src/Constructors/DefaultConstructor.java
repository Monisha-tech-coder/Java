package Constructors;

public class DefaultConstructor {

	int id;
	String name;
	Float float1;
	double d;
	long l;
	char c;
	
	void display() {
		System.out.println(id+" "+name+" "+float1+" "+d+" "+l+" "+c );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DefaultConstructor defaultConstructor=new DefaultConstructor();
defaultConstructor.display();
	}

}
