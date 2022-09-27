package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class AssignmentFlipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\FlipkartScreenshot.jpg");
	Files.copy(src, dest);
	Thread.sleep(3000);
driver.findElement(By.xpath("(//li)[1]")).click();
Thread.sleep(3000);
//WebElement a=driver.findElement(By.xpath("(//div[@class='_30jeq3 _16Jk6d'])[1]"));
//System.out.println(a.getText());
//Thread.sleep(3000);
Set<String>allwin=driver.getWindowHandles();
for(String win:allwin)
{
	 String title=driver.switchTo().window(win).getTitle();
	 if(title.contains("Hp"))
	 {
	String price=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
	
	System.out.println(price);
	break;
	 }
	}
Thread.sleep(3000);
WebElement add=driver.findElement(By.xpath("(//img[@class='_396cs4 _2amPTt _3qGmMb  _3exPp9'])[1]"));
  Actions act=new Actions(driver);
 
    act.moveToElement(add).perform();
    Thread.sleep(2000);
    
driver.findElement(By.xpath("//button[@type='button']")).click();
	


	}

}
