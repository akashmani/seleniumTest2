package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	FileInputStream fis;
	FileOutputStream fout;
	XSSFSheet sheet1;

	 public ExcelDataConfig(String ExcelPath) {
		
		 try {
			File src = new File(ExcelPath);
		    fis = new FileInputStream(src);
		    fout = new FileOutputStream(src);
		    wb = new XSSFWorkbook(fis);
			    
		} 
		 
		 catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	 }
	 
	 
	 public String getData(String sheetNumber,int row, int coloumn)  {
	
		  sheet1 = wb.getSheet(sheetNumber);
		  String data = sheet1.getRow(row).getCell(coloumn).getStringCellValue();
		
		  return data;
	 }
	 
	
	 
		
		

	

}
