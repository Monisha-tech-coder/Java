package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//switch using id 
		driver.switchTo().frame("a077aa5e");
		
		WebElement element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		element.click();
		//driver.switchTo().frame(element);
		
		driver.switchTo().defaultContent();
		
		WebElement mail = driver.findElement(By.id("philadelphia-field-email"));
		mail.sendKeys("monii85067@gmail.com");
		
				
		
	}

}
