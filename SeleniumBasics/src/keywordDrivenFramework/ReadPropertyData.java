package keywordDrivenFramework;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws Throwable {
		//Read the file in read mode
		FileInputStream fis= new FileInputStream("D:\\Selenium\\Automation\\data\\config.properties");
		//Create an object of Properties class
		Properties prop=new Properties();
		//Take control of File
		prop.load(fis);
		//Give the key to get value
		//String provalue=prop.getProperty("trainer_name");
		String provalue=prop.getProperty("browser");
		//String provalue=prop.getProperty("trainername", "Incorrect Key");
		// Print it
		System.out.println(provalue);
		
		
	}
	

}
