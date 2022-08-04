package Variables;

public class StaticVariable {

	 public static String geek = "Jain";         //Declared static variable
	   
	    public static void main (String[] args) {
	        
	      //geek variable can be accessed without object creation
	      //Displaying O/P
	      //GFG.geek --> using the static variable
	        System.out.println("Geek Name is : "+StaticVariable.geek);
	    }
	}


