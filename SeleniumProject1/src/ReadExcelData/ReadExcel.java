package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lib.ExcelDataConfig;

public class ReadExcel {

	public static void main(String[] args)   {
		
		ExcelDataConfig excel = new ExcelDataConfig("F:\\DataSheet\\a1.xlsx");
	    System.out.println(excel.getData("Sheet1", 0, 0));
		

	    }
	    
	}


