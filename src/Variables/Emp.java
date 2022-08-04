package Variables;

public class Emp {
	public int id;
	public String name;
	public static void main(String[] args) {
		//direct initialize without getters and setters
Emp emp= new Emp();
emp.id=99;
emp.name="moni";
int id=emp.id;
String name=emp.name;
System.out.println(id);
System.out.println(name);



	}

}
