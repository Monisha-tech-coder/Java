package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oppo a15s",Keys.ENTER);
		WebElement type = driver.findElement(By.xpath("//span[text()='OPPO A15s (Fancy White, 4GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers']"));
		type.click();
		//to get parent id 
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//to print all windows
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		/*for(String eachwindow:allwindows)
		{
			if(!parent.equals(eachwindow))
					{
				driver.switchTo().window(eachwindow);
					}
		}
		WebElement addTo = driver.findElement(By.id("add-to-cart-button"));
		addTo.click();
		*/
		List<String> listwindow=new ArrayList<String>();
		//add all windows
		
		listwindow.addAll(allwindows);
		
		//get the targeted window
		
		String window1 = listwindow.get(1);
		driver.switchTo().window(window1);
		
		WebElement addTo = driver.findElement(By.id("add-to-cart-button"));
		addTo.click();
	
		
	}

}
