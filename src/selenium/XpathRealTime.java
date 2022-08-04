package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathRealTime {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\java2022\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		Actions actions = new Actions(driver);
		WebElement jobboard = driver.findElement(By.xpath("//div[text()='Job Board']"));
		actions.moveToElement(jobboard).perform();
		Thread.sleep(1000);
		WebElement application = driver.findElement(By.xpath("//a[text()='Applications ']"));
		application.click();

		WebElement webeditor = driver.findElement(By.xpath("//a[text()='Web Editor']"));
		System.out.println(webeditor.getText());
		// to print the selected text
		WebElement name = driver.findElement(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td//strong"));
		System.out.println(name.getText());

		// to print preceding siblings
		List<WebElement> list = driver
				.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding-sibling::td"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

		}
		// to print using following sibling

		List<WebElement> name1 = driver
				.findElements(By.xpath("//a[text()='Web Editor']//parent::td//following-sibling::td"));
		for (int i = 0; i < name1.size(); i++) {
			System.out.println(name1.get(i).getText());

			// to print preceding ancestor

			List<WebElement> list3 = driver
					.findElements(By.xpath("//a[text()='Web Editor']//ancestor::tr//following-sibling::tr"));
			for (int j = 0; j < list3.size(); j++) {
				System.out.println(list3.get(j).getText());

			}

			System.out.println("To print only email");

			// to print only email
			List<WebElement> findElements = driver.findElements(
					By.xpath("//a[text()='Web Editor']//parent::td//preceding::td[@data-colname='E-mail']"));
			for (int k = 0; k < findElements.size(); k++) {
				System.out.println(findElements.get(k).getText());

				// to print all email

				List<WebElement> emailids = driver.findElements(
						By.xpath("//a[text()='Web Editor']//parent::td//following::td[@data-colname='E-mail']"));
				for (int l = 0; l < emailids.size(); l++) {
					System.out.println(emailids.get(l).getText());

				}
			}
		}
	}
}
