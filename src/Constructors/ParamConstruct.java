package Constructors;

public class ParamConstruct {
int id;
String name;
int age;
//creating a paramaterized constructor
ParamConstruct(int i,String s)
{
	id=i;
	name=s;
	
}

//creating three arg constructor  //constructor overloading
ParamConstruct(int i,String n,int a){  
id = i;  
name = n;  
age=a;  
}  
//method to display the values  
void display(){System.out.println(id+" "+name+" "+age);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating objects and passing values  
		ParamConstruct s1 = new ParamConstruct(111,"Karan");  
		ParamConstruct s2 = new ParamConstruct(222,"Aryan",25);  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	}

}
