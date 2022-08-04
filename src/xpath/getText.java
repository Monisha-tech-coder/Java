package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) {

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
				//    WebDriver driver=new FirefoxDriver();  
				     
				  WebDriver driver=new ChromeDriver(); 
				  /*
				  driver.get("https://adactinhotelapp.com/");
				  WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Hotel')]"));
				  String print=text.getText();
				  System.out.println(print);
				  
		  //amazon
		  
		  driver.get("https://www.amazon.in/");
		  WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Use')]"));
		  String print=text.getText();
		  System.out.println(print);
		  */
				  driver.get("http://greenstech.in/selenium-course-content.html");
				  WebElement text=driver.findElement(By.xpath("//span[@title='Overview']"));
				   text.click();
				  WebElement txt=driver.findElement(By.xpath("//p[contains (text(),'class will make you an expert in')]"));
				 
				  String print=txt.getText();
				  System.out.println(print);
				  
}
}

