package PomCodeChallenge;

import java.io.*;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;


public class ExcelUtils  //Do not change the class name
{  
	public static XSSFSheet worksheet;
	public static XSSFWorkbook workbook;
	public static FileInputStream work_file;
	public static String file_path;

	public static String[] readExcelData(String sheetName) throws Exception {
		//Get the excel file path
		
		//Using the sheet name passed to this method, read the data and store it in a string array

		//use the string array to store the values from excel
	
		//use switch case for reading different datatypes
		FileInputStream file=new FileInputStream("CustomerRegistration.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet(sheetName);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell1=row.getCell(0);
		XSSFCell cell2=row.getCell(1);
		XSSFCell cell3=row.getCell(2);
		XSSFCell cell4=row.getCell(3);
		XSSFCell cell5=row.getCell(4);
		
		String[] inputs=new String[5];
		
		inputs[0]=cell1.toString();
		inputs[1]=cell2.toString();
		inputs[2]=cell3.toString();
		inputs[3]=cell4.toString();
		inputs[4]=cell5.toString();
		
		return inputs;

	}


}


