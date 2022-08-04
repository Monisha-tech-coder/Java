package Encapsulation;
//this class is fully encapsulated
public class Account {

	private long acc_no;  
	private String name,email;  
	private float amount;  
	
	//public getter and setter methods  
	//get -return
	//set -this
public long getAccNo()
{
	return acc_no;
}
public void setAccno(long acc_no) {  
    this.acc_no = acc_no;  
}  

public String getName()
{
	return name;
}
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public float getAmount() {  
    return amount;  
}  
public void setAmount(float amount) {  
    this.amount = amount;  
    
}
}