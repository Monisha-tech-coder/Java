package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;


public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("http://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		WebElement butt=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		butt.click();
		 WebElement findElement = driver.findElement(By.id("Textbox"));
		 findElement.click();
		 Alert al=driver.switchTo().alert();
		 al.sendKeys("Hello Ram");
		 al.accept();
		 
	}

}
