package WebTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadersTable {
	
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
		
		for (int i = 0; i <tableRows.size(); i++) {
			WebElement tableRow = tableRows.get(i);
			
			// To fetch Table headers from the Row
			List<WebElement> tableHeaders = tableRow.findElements(By.tagName("th"));
			
			// // Iterate the List of Headers
			for (int j = 0; j < tableHeaders.size(); j++) {
				WebElement tableHeader = tableHeaders.get(j);
				String text = tableHeader.getText();
				System.out.println(text);
				}
		}
		
}
}