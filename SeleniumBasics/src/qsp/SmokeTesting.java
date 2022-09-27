package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTesting {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	String e="actiTIME - Login";
	String a=driver.getTitle();
	if(a.equals(e))
	{
	System.out.println("Login page is displayed,pass");
}
	else
	{
		System.out.println("fail");
	}
WebElement un =driver.findElement(By.id("username"));
un.sendKeys("admin");
	//driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(6000);
String ehometitle="actiTIME - Enter Time-Track";
String ahometitle=driver.getTitle();
//System.out.println(ahometitle);
if(ahometitle.equals(ehometitle))
{
	System.out.println("home page is Displayed,pass");
}
else
{
	System.out.println("home page is not displayed ,fail");
}
}
}
