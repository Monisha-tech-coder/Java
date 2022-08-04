package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
			WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 
			 //#---id
			 // #attributevalue
			 driver.findElement(By.cssSelector("#email")).sendKeys("hello");
			 
			 //tagname#attributevalue
			 
			 driver.findElement(By.cssSelector("input#email")).sendKeys("hello");
			 
			 //tagname.classAttributeValue
			 //tagname.class[attributename=attributevalue]
		
			 
			 //tagname with multiple attribute
			 //tagname[attribute1=attributevalue] [[attribute2=attributevalue].....
			 //starts with(^),ends with($),contains,or substring(*)
			 //tagname[attributename^=prefix]
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}

}
