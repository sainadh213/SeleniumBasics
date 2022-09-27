package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimum_Price {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		/*driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Jul 11 2022'")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(4000);
		
		//List<WebElement> Allprices = driver.findElements(By.xpath("//p[@class='blackText fontSize16 blackFont']"));
		//List<WebElement> Allprices = driver.findElements(By.xpath("//div[@class='priceSection']"));
        //System.out.println(Allprices);
		List<WebElement> Allprices = driver.findElements(By.xpath("//p[@class='blackText fontSize18 blackFont white-space-no-wrap']"));
		int min =1000000000;
		for (WebElement prices : Allprices) {
			
			//System.out.println(prices.getText());
			String price = prices.getText();
		String p = price.replaceAll("[^0-9]", "");
		int val = Integer.parseInt(p);
	
		System.out.println(p);
		if(val<min)
		{
			min=val;
		}
	
			
		}
		System.out.println("Minimum price is :"+min);
		
		Thread.sleep(4000);
		//driver.close();
	}

}
