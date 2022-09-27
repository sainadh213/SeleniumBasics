package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBTable
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Bigg_Boss_(Telugu_season_4)");
	Thread.sleep(2000);
	List<WebElement> abc=driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//td[2]"));
	System.out.println(abc.size());
	for(int i=0;i<abc.size();i++)
	{
		System.out.println(abc.get(i).getText());
	}
	}
}
