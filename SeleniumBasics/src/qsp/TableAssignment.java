package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en.wikipedia.org/wiki/Bigg_Boss_(Telugu_season_4)");
		List<WebElement>allnames=driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tr[*]//td[2]"));
         System.out.println(allnames.size());
       for(int i=0;i<allnames.size();i++)
       {
    	   System.out.println(allnames.get(i).getText());
       }
	}

}
