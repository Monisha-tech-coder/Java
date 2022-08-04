package Inheritance;
//single inheritance 
   //parent class class A
   //    |
   // child class class B       
   
public class TestClass {

	public static void main(String[] args) {
		
		// Class B extends Class A

		// Here I am creating an instance of ClassB
		//classB obj=new classB();  //single inheritance
		
/*classC obj=new classC(); //multilevel
obj.methodOneClassA();
obj.methodOneClassB();
obj.methodOneClassC(); //multi level
*/
		classD obj = new classD();
		obj.methodOneClassA();
		obj.methodOneClassD();  // Hierarchical 
	}

}
