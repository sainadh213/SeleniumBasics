package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus_Date_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		for(int i=1;i<12;i++) {
		try {

			driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']")).click();
			break;
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		}
	}

}
