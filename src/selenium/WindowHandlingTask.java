package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class WindowHandlingTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 button.click();
		 Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		WebElement mobile = driver.findElement(By.xpath("//div[@class='eFQ30H'][1]"));
//		mobile.click();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("OPPO K10 5G",Keys.ENTER);
		
	  WebElement findElement = driver.findElement(By.xpath("//div[text()='OPPO K10 5G (Ocean Blue, 128 GB)']"));
	findElement.click();
	
	
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		//using enhanced for loop
		
		for(String eachwindow:allwindows)
		{
			if(!parent.equals(eachwindow))
				
			{
				driver.switchTo().window(eachwindow);
			}
		}
		
		
		
		WebElement addTo = driver.findElement(By.xpath("//button['_2KpZ6l _2U9uOA _3v1-ww']"));
		addTo.click();
		
	}

}
