package datadrivernframeWork;



import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) throws Throwable {
		//open the file in readmode
		FileInputStream fis=new FileInputStream("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\First.xlsx");
		 
		//Get the control of the File
		Workbook wb= WorkbookFactory.create(fis);
		
		//Go to the Particular Sheet
		Sheet sh= wb.getSheet("Sheet1");
		
		//Go to particular Row
		Row r=sh.getRow(3);
		
		//Prepare the particular Cell
		Cell c=r.createCell(3);
		
		//Set the cell String Value
		c.setCellValue("Amir Khan");
		
		//Open the file in Write mode
		FileOutputStream fos= new FileOutputStream("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\First.xlsx");
		
		//Save the file
		wb.write(fos);
		//Print a message for our Confirmation
		System.out.println("done writing");
	}

}
