package selenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.event.KeyEvent;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 WebElement lnk=driver.findElement(By.id("username"));
		 Actions actions=new Actions(driver);
		 actions.click(lnk).perform();
		 
		 Robot robot=new Robot();
		//press shift to make word capital 
		 robot.keyPress(KeyEvent.VK_SHIFT);
		 
		 robot.keyPress(KeyEvent.VK_M);
		 robot.keyRelease(KeyEvent.VK_M);
		 //release shift
		 robot.keyRelease(KeyEvent.VK_SHIFT);
		 
		 robot.keyPress(KeyEvent.VK_O);
		 robot.keyRelease(KeyEvent.VK_O);
		 robot.keyPress(KeyEvent.VK_N);
		 robot.keyRelease(KeyEvent.VK_N);
		 robot.keyPress(KeyEvent.VK_I);
		 robot.keyRelease(KeyEvent.VK_I);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyRelease(KeyEvent.VK_S);
		 robot.keyPress(KeyEvent.VK_H);
		 robot.keyRelease(KeyEvent.VK_H);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 robot.keyPress(KeyEvent.VK_O);
		 robot.keyRelease(KeyEvent.VK_O);
		 robot.keyPress(KeyEvent.VK_N);
		 robot.keyRelease(KeyEvent.VK_N);
		 robot.keyPress(KeyEvent.VK_I);
		 robot.keyRelease(KeyEvent.VK_I);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyRelease(KeyEvent.VK_S);
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	}

}
