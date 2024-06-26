package CodeChallenge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class CusRegExcel {     //DO NOT change the class name


    public static void writeExcelData() throws Exception  {         //DO NOT change the method signature
	    //Implement code to write the names 'John', 'Peter', 'Sam' to in the excel sheet on the first column
	    //As shown in the image
	    FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\target\\CustReg.xlsx");
	    
	    //file.getAbsolutePath();
	    
	    XSSFWorkbook workbook=new XSSFWorkbook();
	    
	    XSSFSheet sheet=workbook.createSheet();
	    
	    XSSFRow row=sheet.createRow(0);
	    
	    row.createCell(0).setCellValue("John");
	    
	    row.createCell(1).setCellValue("Peter");
	    
	    row.createCell(2).setCellValue("Sam");
	    
	    workbook.write(file);
	    
	    workbook.close();
	    
	    file.close();
    }
    public static void main(String[] args) throws Exception 
	{ 
	    CusRegExcel customer = new CusRegExcel();
	    //Add required code
	    customer.writeExcelData();
	}
}

  