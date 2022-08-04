package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		  WebElement s=driver.findElement(By.id("credit2"));
		  WebElement d=driver.findElement(By.id("bank"));
		  
		  WebElement s1=driver.findElement(By.id("fourth"));
		  WebElement d1=driver.findElement(By.id("amt7"));
		  
		  WebElement s2=driver.findElement(By.id("credit1"));
		  WebElement d2=driver.findElement(By.id("loan"));
		  
		  WebElement s3=driver.findElement(By.id("fourth"));
		  WebElement d3=driver.findElement(By.id("amt8"));
		  
		  Actions action=new Actions(driver);
		  
		  action.dragAndDrop(s, d).perform();
		  action.dragAndDrop(s1, d1).perform();
		  action.dragAndDrop(s2, d2).perform();
		  action.dragAndDrop(s3, d3).perform();
		// driver.quit();
		  WebElement txt=driver.findElement(By.id("equal"));
		  String text = txt.getText();
		  System.out.println(text);
		  
		
		  
	}

}
