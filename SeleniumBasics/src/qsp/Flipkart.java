package qsp;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptops");
	Thread.sleep(2000);
	driver.findElement(By.className("_34RNph")).click();
	Thread.sleep(2000);
	WebElement d=driver.findElement(By.xpath("(//select)[2]"));
	Select sel=new Select(d);
	Thread.sleep(2000);
	sel.selectByIndex(3);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Core i3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and text()='DELL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
	//WebElement a=driver.findElement(By.xpath("//div[@class='_4rR01T']//ancestor::div[@class='col col-7-12']/descendant::li[contains(text(),'RAM')]"));
	WebElement a=driver.findElement(By.xpath("(//li)[2]"));
	System.out.println("Laptop RAM is : "+a.getText());
	Thread.sleep(2000);
	//WebElement b=driver.findElement(By.xpath("//div[text()='DELL Vostro Core i3 11th Gen - (8 GB/256 GB SSD/Windows 10) Vostro 3400 Thin and Light Laptop']/ancestor::a[@class='_1fQZEK']/descendant::div[text()='₹40,440']"));
	WebElement b=driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
	System.out.println("Laptop Price is : "+b.getText());
	//Thread.sleep(5000);
	//driver.close();
}
}
