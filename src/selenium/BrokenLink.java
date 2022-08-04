package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;

import okhttp3.Connection;



public class BrokenLink {
	int linkcount=0;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
 driver.manage().window().maximize();
List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());



for (int i = 0; i < links.size(); i++) {
	
	System.out.println(links.get(i).getAttribute("href"));
	Thread.sleep(200);
}
int linkcount=0;

for (int j = 0; j < links.size(); j++) {
	String attribute = links.get(j).getAttribute("href");
	System.out.println(attribute);
	Thread.sleep(200);
	//to find the broken link

	if (attribute!=null) {
		URL url=new URL(attribute);
		
		
		//Urlconnection
		
		URLConnection connection=url.openConnection();
		HttpURLConnection connection2= (HttpURLConnection) connection;
		int responseCode = connection2.getResponseCode();
		
		if(responseCode>=400)
		{
			System.out.println(attribute);
			
	
		}
		linkcount++;
		
		System.out.println("broken link" +" "+ linkcount);
		
	}


}
	}
}

	


