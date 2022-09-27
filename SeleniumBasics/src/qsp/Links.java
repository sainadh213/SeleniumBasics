package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onlinegdb.com/online_java_compiler");
		List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked text-center']/descendant::a"));
		for (WebElement links : alllinks) {
			System.out.println(links.getText()+"  "+links.getAttribute("href"));
			String url = links.getAttribute("href");
			
			
		}

	}

}
