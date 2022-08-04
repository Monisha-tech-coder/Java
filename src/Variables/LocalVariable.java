package Variables;


public class LocalVariable {
 
void display() //inside the method is LOCAL
{
int age=25; //declare
String name="Monisha";

	System.out.println("My name is" +" "+name+" and my age is " +age);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalVariable L=new LocalVariable();
L.display();
	}

}
