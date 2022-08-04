package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		JavascriptExecutor Executor= (JavascriptExecutor)driver;
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		Executor.executeScript("arguments[0].setAttribute('value','Greens')", username);
		Object name=Executor.executeScript("arguments[0].setAttribute('value','Greens')", username);
		System.out.println(name);
		
		WebElement password=driver.findElement(By.id("pass"));
		Executor.executeScript("arguments[0].setAttribute('value','Hello@123')", password);
		Object pass=Executor.executeScript("arguments[0].setAttribute('value','Hello@123')", password);
		System.out.println(pass);
		
		WebElement btlogin=driver.findElement(By.name("login"));
		Executor.executeScript("arguments[0].click()", btlogin);
		
		
		
	}

}
