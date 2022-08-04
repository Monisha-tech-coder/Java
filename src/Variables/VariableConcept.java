package Variables;

public class VariableConcept {
	 int id=10;// instance
	 //static int id =10; //static
	private void m1()
	{
		id=100; // local
		System.out.println(id);
	}
private void m3() {
System.out.println(id);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableConcept a=new VariableConcept();
		a.m1();
		a.m3();
		VariableConcept a1=new VariableConcept();
		a1.m3();
		a1.m1();
		
	}

}
