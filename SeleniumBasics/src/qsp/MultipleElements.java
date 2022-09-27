package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Cart']")).click();
//Thread.sleep(2000);
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
driver.findElement(By.xpath("//span[text()='Login']")).click();
Thread.sleep(5000);
driver.close();
	}

}
