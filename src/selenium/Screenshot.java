package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		// to screenshot the whole page
		 
	     TakesScreenshot Screenshot=(TakesScreenshot) driver;
		
		
		 // to get a particular element ss
		 WebElement txtuser=driver.findElement(By.className("_9vtf"));
		 //element.sendKeys("Greens");
		 
		 File s = txtuser.getScreenshotAs(OutputType.FILE);
		 
		File d=new File("C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Screenshot\\fb.png");
		FileUtils.copyFile(s, d);
		
		
	}

}
