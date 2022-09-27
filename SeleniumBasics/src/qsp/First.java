package qsp;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Automation\\drivers\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.manage().window().minimize();
	//Dimension d=new Dimension(700, 500);
//driver.manage().window().setSize(d);
	//Point p=new Point(600,300);
	//driver.manage().window().setPosition(p);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	
	
}
}