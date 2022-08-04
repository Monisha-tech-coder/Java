package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;


public class SampleTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txt = driver.findElement(By.xpath("//input[@name='email']"));
		 txt.sendKeys("greens");
		 File s = txt.getScreenshotAs(OutputType.FILE);
                 
		 File d= new File("C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Screenshot\\task1.png");
		 FileUtils.copyFile(s, d);
		 driver.quit();
		 
		
	}

}
