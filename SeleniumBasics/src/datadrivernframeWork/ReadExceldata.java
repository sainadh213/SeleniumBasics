package datadrivernframeWork;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExceldata {

	public static void main(String[] args) throws Throwable  {
		for(int i=0;i<=6;i++)
		{
			//open the file in readmode
		FileInputStream fis=new FileInputStream("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\First.xlsx");
		
		//Get the control of the File
		Workbook wb =WorkbookFactory.create(fis);
		
		//Go to the Particular Sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//Go to particular Row
		Row ro=sh.getRow(i);
		
		//Go to particular Cell
		Cell c=ro.getCell(0);
		
		//Get the cell String Value
		String val=c.getStringCellValue();
		
		//Print it
		System.out.println(val);
		}
			
		}
	
		}


