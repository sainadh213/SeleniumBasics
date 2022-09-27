package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/MultipleSelectDropdown.html");
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.name("Hotel"));
		Select sel=new Select(add);
		List<WebElement> allopt=sel.getOptions();
	/*	for(WebElement oneOption:allopt)
		{
			String text=oneOption.getText();
			System.out.println(text);
		}*/
		

        /*Set<String>s=new HashSet<String>();
           for(WebElement oneOption:allopt)
           {
        	   String text=oneOption.getText();
        	   s.add(text);
           }
           for(String oneText:s)
           {
        	   System.out.println(oneText);
           }*/
		
		/*Set<String>s=new LinkedHashSet<String>();
        for(WebElement oneOption:allopt)
        {
     	   String text=oneOption.getText();
     	   s.add(text);
        }
        for(String oneText:s)
        {
     	   System.out.println(oneText);
        }*/

           Set<String>ts=new TreeSet<String>();
           
        	  /*for(WebElement oneOption:allopt)
        	   {
        		  String text=oneOption.getText();
        		  ts.add(text);
        	   }
        	   for(String oneText:ts)
        	   {
        		   System.out.println(oneText);*/
           for(WebElement oneOption:allopt)
           {
        	 String text= oneOption.getText();
        	 ts.add(text);
           }
           for(String oneText:ts)
           {
        	   System.out.println(oneText);
           }
           
        	   
           
	}
}
           
	


