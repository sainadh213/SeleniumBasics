package qsp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class handling_Dynamic_Dropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Automation\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://qspiders.com/");
		driver.manage().window().maximize();
	/*	WebElement tel=driver.findElement(By.xpath("//span[text()='Telangana']"));
         Actions s=new Actions(driver);
         s.moveToElement(tel).perform();
         Thread.sleep(2000);
         List<WebElement>allops=driver.findElements(By.xpath("//a[@class='dropdown-item']"));
         System.out.println(allops.size());
		for(int i=0;i<allops.size();i++)
         {
        	 String text=allops.get(i).getText();
        	 if(text.equals("Hyderabad - KPHB"))
        	 {
        		 allops.get(i).click();
        		 break;
        	 }
         }*/
         Actions at=new Actions(driver);
 		WebElement add=driver.findElement(By.xpath("//span[text()='Telangana']"));
 		at.moveToElement(add).perform();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//a[text()='Hyderabad - KPHB']")).click();
 		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='button is-persian is-small has-text-weight-semibold']")).click();
		//driver.findElement(By.xpath("//a[@class='button is-persian is-small has-text-weight-semibold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fas fa-user-plus fa-lg'])[3]")).click();
        //driver.findElement(By.xpath("//i[@class='fas fa-user-plus fa-lg']")).click();
        Thread.sleep(2000);
       /* WebElement mob=driver.findElement(By.xpath("//input[@placeholder='Your Mobile Number']"));
        mob.click();
        mob.sendKeys("90312345");
        TakesScreenshot ts=(TakesScreenshot)driver;
    File  src= ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\Qspders.jpg");
        Files.copy(src, dest);*/
 		
driver.manage().window().minimize();
}
}
