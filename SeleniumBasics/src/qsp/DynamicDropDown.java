package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
driver.get("https://www.google.com/");
Thread.sleep(2000);
WebElement ddadd=driver.findElement(By.name("q"));
ddadd.sendKeys("qspiders hyderabad");
Thread.sleep(2000);
List<WebElement> allopt =driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
/*
 System.out.println(allopt.size());
 
for(int i=0;i<allopt.size();i++)
{
	System.out.println(allopt.get(i).getText());
}
	Thread.sleep(2000);
	ddadd.sendKeys(Keys.DOWN);
	Thread.sleep(2000);
	ddadd.sendKeys(Keys.DOWN);
	Thread.sleep(2000);
	ddadd.sendKeys(Keys.DOWN);
	Thread.sleep(2000);
	ddadd.sendKeys(Keys.ENTER);
	*/
for(int i=0;i<allopt.size();i++)
{
	String text=allopt.get(i).getText();
	if(text.equals("qspiders hyderabad kphb photos"))
	{
		allopt.get(i).click();
		break;
	}
	}
	
	}
	}


