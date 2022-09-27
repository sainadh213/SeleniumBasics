package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateDropDown {
	public static void main(String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]")).click();
	//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	
//	WebElement element = driver.findElement(By.xpath("//div[@id='slider']/descendant::span[@style='left: 0%;']"));
//	
//	Actions ac=new Actions(driver);
//	
//	ac.dragAndDropBy(element, 200, 0).perform();
//	
//		driver.findElement(By.xpath("(//div[@class='dateInnerCell']/ancestor::div[@class='DayPicker-Day'])[1]")).click();
	for(int i=1;i<=12;i++) {
		try {
			driver.findElement(By.xpath("//div[@aria-label=\"Tue Oct 18 2022\"]")).click();
			break;
		}catch (Exception e) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			}
			
		}
	}
}
