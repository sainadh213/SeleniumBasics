package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/Popup.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(2000);
              al.accept();
	}

}
