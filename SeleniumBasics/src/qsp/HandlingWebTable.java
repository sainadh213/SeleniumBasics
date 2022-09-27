package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/table.html");
		List<WebElement>alltds=driver.findElements(By.tagName("td"));
		System.out.println("Full page tds :"+alltds.size());
		WebElement row4=driver.findElement(By.xpath("//tr[4]"));
	List<WebElement>row4tds=row4.findElements(By.tagName("td"));
	System.out.println("4th Row tds :"+row4tds.size());
		

	}

}
