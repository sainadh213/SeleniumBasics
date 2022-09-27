package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Author name");
				//String authorname=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.brainyquote.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Authors'])[2]")).click();
		WebElement ad=driver.findElement(By.name("q"));
		ad.click();
		Thread.sleep(2000);
		//ad.sendKeys(authorname);
		driver.findElement(By.xpath("(//input[@src='/st/img/4782095/fa/search.svg'])[1]")).click();
	
	driver.findElement(By.xpath("//span[text()='A. P. J. Abdul Kalam']")).click();
		
		List<WebElement> all=driver.findElements(By.xpath("//div[@style='display: flex;justify-content: space-between']"));
		
      for(int i=0;i<all.size();i++)
      {
    	 System.out.println(all.get(i).getText()); 
      }
		List<WebElement>allopt=driver.findElements(By.xpath("//div[@class='row bq_left']"));
		System.out.println(allopt.size());
		for(int i=0;i<allopt.size();i++)
		{
			String text=allopt.get(i).getText();
			if(text.equals("A. P. J. Abdul Kalam"))
			{
				allopt.get(i).click();
				break;
			}
	
	}
		
	}
}