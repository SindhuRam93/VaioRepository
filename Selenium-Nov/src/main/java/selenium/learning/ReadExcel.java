package selenium.learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



@Test

public class ReadExcel {

	String dataSheetName;
	public void excelReadData() throws InvalidFormatException, IOException{
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the data sheet name");
		
		dataSheetName= scan.next();
		FileInputStream fis = new FileInputStream("F:\\ExcelData\\"+dataSheetName+".xlsx");
	
	// open the workbook
	   XSSFWorkbook workBook = new XSSFWorkbook(fis);
	   
	 // open the sheet
	     XSSFSheet sheet = workBook.getSheetAt(0);
	  //get the row count and column count
	     
	     int rowCount = sheet.getLastRowNum();
	     int columnCount= sheet.getRow(0).getLastCellNum();
	     
	     
	     
	     
	     
	     //get cell details
	     
	     for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
	}
	
}
