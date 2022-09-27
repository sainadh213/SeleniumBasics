package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingPopups1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/Confirm.html");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='I LOVE YOU']")).click();
	Thread.sleep(2000);
    Alert al=driver.switchTo().alert();
    //System.out.println(al.getText());
    //al.accept();
    System.out.println(al.getText());
    al.dismiss();
    
    	}

}
