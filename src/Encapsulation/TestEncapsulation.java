package Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc=new Account();
acc.setAccno(123456789456123L);
acc.setName("Sonoo Jaiswal");  
acc.setEmail("monii@gmail.com");  
acc.setAmount(500000f);  
//getting values through getter methods  
System.out.println("my acc no is "+acc.getAccNo()+ " and my name is "+acc.getName()+ "\n"+ "my email id is " +acc.getEmail() + " and my balance is "+acc.getAmount());  


	}

}
