package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		 /*driver.get("http://www.greenstechnologys.com/");
		 driver.manage().window().maximize();
		  WebElement lnk=driver.findElement(By.xpath("//a[text()='COURSES']"));
		  Actions action=new Actions(driver);
		  action.moveToElement(lnk).perform();
		  WebElement txt=driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
		//  action.moveToElement(txt).perform();
		 // WebElement txt1=driver.findElement(By.xpath("//span[text()='Data Science with R Training')]"));
		 txt.click();
		 */
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 WebElement button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 button.click();
		 Thread.sleep(2000);
		  WebElement s=driver.findElement(By.xpath("//div[text()='Electronics']"));
		  
		  Actions action=new Actions(driver);
		  action.moveToElement(s).perform();
		  
		  WebElement d=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		  action.moveToElement(d).perform();
		  
		  WebElement lap=driver.findElement(By.xpath("//a[text()='Laptops']"));
		  action.moveToElement(lap).perform();
		  lap.click();
		  WebElement txt=driver.findElement(By.xpath("//span[text()='Become a Seller']"));
		  String text = txt.getText();
		  System.out.println(text);
		  
	}

}
