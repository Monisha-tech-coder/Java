package Variables;


public class GettersAndSetters {

	private int id ;
	private String name;
	
public int getId() {
	return id;
}

public void setId(int id) {
	if(id>100) //with getters and setters you can initialize the condition for the variables 
	{
	this.id = id;
}
}
public String getName() {
	return name;

}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] args) {
	
GettersAndSetters g=new GettersAndSetters();
g.setId(99);
g.setName("moni");
int id2 = g.getId();
System.out.println(id2);

String name2 = g.getName();
System.out.println(name2);

}
}

