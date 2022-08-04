package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassTask {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://omrbranch.com/api/documentation");
		 driver.manage().window().maximize();
		// Alert al=driver.switchTo().alert();
		 Robot robot= new Robot();
		 robot.keyPress(KeyEvent.VK_SHIFT);
		 
		 robot.keyPress(KeyEvent.VK_M);
		 robot.keyRelease(KeyEvent.VK_M);
		 
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
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		 
		 
	}

}
