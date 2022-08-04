package Variables;

public class InstanceVariable {

	 public String geek; // Declared Instance Variable
	 
	    public InstanceVariable()
	    { // Default Constructor
	 
	        this.geek = "Shubham Jain"; // initializing Instance Variable
	    }
	//Main Method
	    public static void main(String[] args)
	    {
	 
	        // Object Creation
	    	InstanceVariable name = new InstanceVariable();
	        // Displaying O/P
	        System.out.println("Geek name is: " + name.geek);
	    }
	
	

}
