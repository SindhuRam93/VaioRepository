package selenium.learning;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



@Test

public class ReadExcel {

	
	public void excelReadData() throws InvalidFormatException, IOException{
	File excel = new File("./data/CreateLead.xlsx");
	
	// open the workbook
	   XSSFWorkbook workBook = new XSSFWorkbook(excel);
	   
	 // open the sheet
	     XSSFSheet sheet = workBook.getSheetAt(0);
	  //get the row count and column count
	     
	     int rowCount = sheet.getLastRowNum();
	     int columnCount= sheet.getRow(0).getLastCellNum();
	     
	     
	     
	     
	     
	     //get cell details
	     
	     for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			System.out.println("\t");
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
	}
	
}
