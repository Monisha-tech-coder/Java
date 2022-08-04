package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		WebElement commands = driver.findElement(By.name("selenium_commands"));
		Select select= new Select(commands);
		//single value selection
		
		//select.selectByIndex(2);
		//select.selectByIndex(3);
		
		//selectalloptionsbyindex (multivalue selection)
		
		List<WebElement> options = select.getOptions();
		//iterate
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			
		}
		//print all the selected options text
		/*for (WebElement element : options) {
			String text = element.getText();
			System.out.println(text);
		}
		*/
		//print the 1st selected option
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		//deselect the selected option
		Thread.sleep(3000);
		select.deselectByIndex(0);
		Thread.sleep(3000);
		select.deselectAll();
		
		
		
	
	}

}
