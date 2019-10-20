package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File source = new File("./ApplicationTestData/ApplicationData.xlsx");
		
		try {
			FileInputStream fs = new FileInputStream(source);
			
			wb = new XSSFWorkbook(fs);
			
		} catch (Exception e) 
		{
			
			System.out.println("Exception is "+e.getMessage());
		}		
	}

	public String getData(int sheetIndex, int row, int column)
	{
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	public String getData(String sheetName, int row, int column)
	{
		String data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
}
