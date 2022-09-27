package qsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// for handling mouse hover action
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement moreadd=driver.findElement(By.xpath("//div[text()='More']"));
		Actions a=new Actions(driver);
		a.moveToElement(moreadd).perform();*/
		
		//Perform double click
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
	WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
	search.click();
		Thread.sleep(2000);
		search.sendKeys("Laptops");
		Thread.sleep(2000);
		driver.findElement(By.className("_34RNph")).click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.doubleClick(search).perform();*/
		
		//Perform Right click
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement cancel=driver.findElement(By.xpath("//button[text()='✕']"));
		Actions a=new Actions(driver);
		a.contextClick(cancel).perform();*/
		
		//Perform Right clicked options
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement cancel=driver.findElement(By.xpath("//button[text()='✕']"));
		Actions a=new Actions(driver);
		a.contextClick(cancel).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);*/
		//Perform Drag and Drop
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
	WebElement source=driver.findElement(By.id("box7"));
	WebElement dest=driver.findElement(By.id("box107"));
	Actions a=new Actions(driver);
		a.dragAndDrop(source,dest).perform();
		
		
		

	}

}
