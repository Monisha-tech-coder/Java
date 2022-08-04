package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("Monisha1297");
		 
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("Moni@1234");
		 
		 WebElement button = driver.findElement(By.id("login"));
		 button.click();
		 
		 WebElement Location = driver.findElement(By.id("location"));
		 Select select= new Select(Location);
		select.selectByIndex(3);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		 Select select1= new Select(hotel);
		 select1.selectByIndex(3);
		 
		 WebElement Room = driver.findElement(By.id("room_type"));
		 Select select2= new Select(Room);
		 select2.selectByIndex(3);
		 
		 WebElement RoomNo = driver.findElement(By.id("room_nos"));
		 Select select3= new Select(RoomNo);
		 select3.selectByIndex(3);
		 
		 WebElement date = driver.findElement(By.name("datepick_in"));
		 date.sendKeys("28/06/2022");
		 
		 WebElement outdate = driver.findElement(By.name("datepick_out"));
		 outdate.sendKeys("29/06/2022");
		 
		 WebElement Roomper = driver.findElement(By.id("adult_room"));
		 Select select4= new Select(Roomper);
		 select4.selectByIndex(2);
		 
		 WebElement childroom = driver.findElement(By.id("child_room"));
		 Select select5= new Select(childroom);
		 select5.selectByIndex(2);
		 
		 WebElement button1 = driver.findElement(By.id("Submit"));
		 button1.click();
		 Thread.sleep(5000);
		 
		 WebElement button2 = driver.findElement(By.id("radiobutton_0"));
		 button2.click();
		 
		 WebElement button3 = driver.findElement(By.id("continue"));
		 button3.click();
		 
		 WebElement FirstName = driver.findElement(By.id("first_name"));
		 FirstName.sendKeys("Monisha");
		 
		 WebElement LastName = driver.findElement(By.id("last_name"));
		 LastName.sendKeys("Paraniraj");
		 
		 WebElement Address = driver.findElement(By.id("address"));
		 Address.sendKeys("dahgdafgaeefaefh");
		 
		 WebElement cc = driver.findElement(By.id("cc_num"));
		 cc.sendKeys("1234567891234567");
		 
		 WebElement type = driver.findElement(By.id("cc_type"));
		 Select select6= new Select(type);
		 select6.selectByIndex(2);
		 
		 WebElement mon = driver.findElement(By.id("cc_exp_month"));
		 Select select7= new Select(mon);
		 select7.selectByIndex(2);
		 
		 WebElement year = driver.findElement(By.id("cc_exp_year"));
		 Select select8= new Select(year);
		 select8.selectByIndex(4);
		 
		 WebElement cvnum = driver.findElement(By.id("cc_cvv"));
		 cvnum.sendKeys("1234");
		 
		 WebElement but = driver.findElement(By.id("book_now"));
		 but.click();
		
		 Thread.sleep(5000);
		  WebElement element = driver.findElement(By.xpath("//input[@id='order_no']"));
		 String orderno = element.getAttribute("value");
		 
		 System.out.println(orderno);
		 
		 
	 
	}

}
