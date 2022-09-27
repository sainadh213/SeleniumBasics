package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/Dropdown.html");
	driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/MultipleSelectDropdown.html");
	Thread.sleep(2000);
	WebElement d=driver.findElement(By.name("Hotel"));
	Select sel=new Select(d);
	Thread.sleep(2000);
	//sel.selectByVisibleText("POORI");
	//sel.selectByValue("g");
	//sel.selectByIndex(3);
	//d.click();
	if(sel.isMultiple())
	{
		System.out.println("It is a Multiple select dropdown");
	}
	else
	{
		System.out.println("It is a Single select dropdown");
	}
	sel.selectByVisibleText("POORI");
	sel.selectByValue("g");
	sel.selectByIndex(3);
	//Thread.sleep(2000);
	//sel.deselectAll();
	//WebElement fsopt=sel.getFirstSelectedOption();
	//System.out.println(fsopt.getText());
	List<WebElement>allselopts=sel.getAllSelectedOptions();
	for(int i=0;i<allselopts.size();i++)
	{
		System.out.println(allselopts.get(i).getText());
	}
	List<WebElement> allopt=sel.getOptions();
	/*System.out.println(allopt.size());
	for(int i=0;i<allopt.size();i++) 
	{
		System.out.println(allopt.get(i).getText());
	}*/
	/*WebElement we=sel.getWrappedElement();
	for(int i=0;i<allopt.size();i++)
	{
		System.out.println(allopt.get(i).getText());
	}*/
}
}
