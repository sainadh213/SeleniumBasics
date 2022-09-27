package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Automation\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		//1.Through Typecating
		/*TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\FacebookScreenShot.jpg");
		Files.copy(src, dest);*/
		
		//2.Through Downcating
		/*RemoteWebDriver rwd=(RemoteWebDriver)driver;
		File src=rwd.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\FacebookScreenShot1.jpg");
        Files.copy(src, dest);*/
		
		//3.Through EventFiringWebdriver class
		/*EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File src=efw.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\FacebookScreenShot2.png");
		Files.copy(src, dest);*/
		
		//Taking Screenshot of a particular Element
		
		WebElement add=driver.findElement(By.xpath("//img[@alt='Facebook']"));
			File src=add.getScreenshotAs(OutputType.FILE);
	        File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\FacebookScreenShot4.png");
				Files.copy(src,dest);
				}

}
