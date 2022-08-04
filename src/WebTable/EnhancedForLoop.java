package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnhancedForLoop
{
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");  


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		// TO get the Headers from the Table
        WebElement table = driver.findElement(By.id("customers"));
		
		// To fetch the Data from The ROW TABLE
		
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		
		// Iterate the List of Rows
		
		for (WebElement eachRow : tableRows) {

			// To fetch Table Datas from the Row
			List<WebElement> tableDatas = eachRow.findElements(By.tagName("td"));

			// // Iterate the List of Headers
			for (WebElement eachData : tableDatas) {
				String text = eachData.getText();
				System.out.println(text);
			}
			
		}}}