package selenium;


import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement dDnSkills = driver.findElement(By.id("Skills"));
		Select select= new Select(dDnSkills);
		select.selectByIndex(10);
		
		//count of all the options in dropdown
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		//print specific index from the options
		
		String text = options.get(5).getText();
		System.out.println(text);
		
		//print all options text
		
		/*for (int i = 0; i < options.size(); i++) {
			String text2 = options.get(i).getText();
			System.out.println(text2);
			*/
		
		//using enchanced forloop to get attributevalue
		
		for (WebElement element : options) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
			
		}
		
		
	}

}
