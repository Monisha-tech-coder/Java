package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		//    WebDriver driver=new FirefoxDriver();  
		     
		  WebDriver driver=new ChromeDriver();  
		  //launch fb
		 /*
		  driver.get("https://www.facebook.com/");
		  WebElement username = driver.findElement(By.id("email"));
		  username.sendKeys("Monisha");
		  WebElement password = driver.findElement(By.id("pass"));
		  password.sendKeys("Monisha@123");
		  
		  
		  //launch redbus
		 /* driver.get("https://www.redbus.in/");
		  WebElement from = driver.findElement(By.id("src"));
		  from.sendKeys("chennai");
		  WebElement to = driver.findElement(By.id("dest"));
		  to.sendKeys("madhurai");
		  
		  
		  //launch google
		  driver.get("https://www.google.com/");
		  WebElement entertxt = driver.findElement(By.name("q"));
		  entertxt.sendKeys("Greens technology");
		 
		  
		  //launch icici
		  
		//  driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		  //Due to security reason,Right Click is not allowed.
		  
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  WebElement entertxt1 = driver.findElement(By.name("fldLoginUserId"));
		  entertxt1.sendKeys("Monisha");
		  //unable to enter userid
		    //nosuchelementexception
		     
		   //launch swiggy
		    

		  driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=CjwKCAjw46CVBhB1EiwAgy6M4ozrcom8MFymX0zW01cWs7bzTWw0rxJRPcH85QlpqKtoA06TmvDiPBoCC8QQAvD_BwE");
		  WebElement loca = driver.findElement(By.id("location"));
		  loca.sendKeys("chennai");  
		 
		 //launch snapdeal
		  * 
		 
		  driver.get("https://www.snapdeal.com/login");
		  WebElement entertxt1 = driver.findElement(By.name("username"));
		  entertxt1.sendKeys("9056868981");
		  
	
          //launch insta
 
		  driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		  WebElement entertxt1 = driver.findElement(By.name("username"));
		  entertxt1.sendKeys("Monisha");
		  
		  WebElement entertxt2 = driver.findElement(By.name("password"));
		  entertxt1.sendKeys("Monisha@123");
		  
		  //nosuchelementexception
		   
		  driver.get(" http://demo.automationtesting.in/Register.html");
		  WebElement entertxt1 = driver.findElement(By.className("form-control ng-pristine ng-valid ng-touched"));
		  entertxt1.sendKeys("sholignallur");
		 //invalid selector exception
		  
		  */
		  
		  driver.get("http://adactinhotelapp.com/");
		  WebElement entertxt1 = driver.findElement(By.name("username"));
		  entertxt1.sendKeys("monisha");
		  WebElement entertxt2 = driver.findElement(By.id("password"));
		 entertxt2.sendKeys("Monisha@123");
		
		  
		  
		  
	}

}
