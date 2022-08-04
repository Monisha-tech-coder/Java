package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathSecondClass {
	public static void main(String[] args) {

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
			//    WebDriver driver=new FirefoxDriver();  
			     
			  WebDriver driver=new ChromeDriver();  
			  //launch amazon
		/*	 
			  driver.get("https://www.amazon.in/");
			  WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
			  box.sendKeys("iphone");
			  WebElement search = driver.findElement(By.id("nav-search-submit-button"));
			  search.click();
			  
			  driver.get("https://www.facebook.com/");
			  WebElement box = driver.findElement(By.xpath("//input[@id='email']"));
			  box.sendKeys("Monisha");
			  WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
			  password.sendKeys("MonishaW@123");
			  WebElement Login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
			  
			 Login.click();
			 
			  
			  driver.get("http://demo.automationtesting.in/Register.html");
			  WebElement box = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			  box.sendKeys("Monisha");
			  
			  WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			  last.sendKeys("P");
			  
			  WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
			  add.sendKeys("chennai");
			  WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			  email.sendKeys("Monii@gmail.com");
			  WebElement no = driver.findElement(By.xpath("//input[@type='tel']"));
			  no.sendKeys("9675258159");
			  
			 
			  WebElement button = driver.findElement(By.xpath("//input[@name='radiooptions']"));
			  button.click();
			  
			  WebElement check = driver.findElement(By.xpath("//input[@id='checkbox1']"));
			  check.click();
			  
			  WebElement drop = driver.findElement(By.xpath("//input[@id='Skills']"));
			  drop.click();
			  
			  driver.close();
			 
			  driver.get("http://greenstech.in/selenium-course-content.html");
			  WebElement clic = driver.findElement(By.xpath("//div[@id='heading20']"));
			  clic.click();
			  WebElement targ = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
			  targ.click();
			 
			  driver.get("https://www.redbus.in/");
			  driver.manage().window().maximize();
			  WebElement targ = driver.findElement(By.xpath("//div[@id='signin-block']"));
			  targ.click();
			  WebElement sign = driver.findElement(By.xpath("//Li[@id='signInLink']"));
			  sign.click();
			  WebElement line = driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
			  line.sendKeys("956789456");
			  
			 
			  
			  driver.get("https://www.cleartrip.com/trains");
			  driver.manage().window().maximize();
			  WebElement targ = driver.findElement(By.xpath("//input[@id='from_station']"));
			  targ.sendKeys("chennai");
			  WebElement targ1 = driver.findElement(By.xpath("//input[@id='to_station']"));
			  targ1.sendKeys("Madurai");
			  WebElement targ2 = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
			  targ2.click();
			  
			  driver.get("http://greenstech.in/selenium-course-content.html");
			  WebElement model = driver.findElement(By.xpath("//div[@id='heading201']"));
			  model.click();
			  WebElement model1 = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
			  model1.click();
			  driver.get("https://www.flipkart.com/");
			  WebElement model = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			  model.sendKeys("9587258787");
			  WebElement model1 = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
			  model1.sendKeys("moni@123");
			  WebElement buton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
			 
			  driver.get("https://www.amazon.in/");
			  WebElement ref = driver.findElement(By.xpath("//img[@alt='Smart LED TVs']"));
			  ref.click();
			  WebElement ref1 = driver.findElement(By.xpath("//img[@alt='AmazonBasics 127 cm (50 inches) 4K Ultra HD Smart LED Fire TV AB50U20PS (Black)']"));
			  ref1.click();
			   
			  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
			  WebElement first = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
			  first.sendKeys("monisha");
			  WebElement last = driver.findElement(By.xpath("//input[@id='lastName']"));
			  last.sendKeys("p");
			  WebElement mail = driver.findElement(By.xpath("//input[@id='username']"));
			  mail.sendKeys("moni");
		   WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
	   pass.sendKeys("moniA123");
	   WebElement conf = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	   conf.sendKeys("moniA123");
	   WebElement next = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
	   next.click();
	   
			  driver.get("https://www.snapdeal.com/");
	  
	   WebElement web = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	   web.click();
	   
	   
	   WebElement reg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	   reg.click();
	   WebElement num = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly ']"));
	   num.sendKeys("987456123");
	   WebElement click = driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
	   click.click();
	  
			  driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");	
			  WebElement login = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
			  login.sendKeys("987456123");
			  WebElement clic = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
			  clic.click();
			  */
			  driver.get("https://www.swiggy.com/");
			  WebElement sign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
			  sign.click();
			  WebElement text=driver.findElement(By.id("mobile"));
			  text.sendKeys("987456123");
			  WebElement name=driver.findElement(By.id("name"));
			  name.sendKeys("Monisha");
			  WebElement text1=driver.findElement(By.id("email"));
			  text1.sendKeys("monii@gmail.com");
			  WebElement text2=driver.findElement(By.id("password"));
			  text2.sendKeys("123456");
			  WebElement text3=driver.findElement(By.xpath("//a[@class='a-ayg']"));
			  text3.click();
			  
	}
	}
	


