package PomCodeChallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCustomerRegistration{
    
	//use the respective variable 
	//do not change the method and variable declaration
	public static WebDriver driver;

	CustomerRegistration cust;
	public static String successmsg;
	public static String[] data;

	public void setUp() {
		//create the driver using method 'getDriver' in class DriverSetup.
		//Assign it to the variable 'driver'
  		driver=DriverSetup.getWebDriver();
  		//do not change it
  		cust=new CustomerRegistration(driver);

	}

	public static String[] getExcelData() throws Exception {

		//Call the method 'readExcelData' in class 'ExcelUtils' using sheet name 'customer_valid'
		//Return the value
		return ExcelUtils.readExcelData("customer_valid");
		
		
	}


	public void testValidSubmit() throws Exception {	
	    
	    //call the method getExcelData() and store the excel data in an array
		//call the method required in class 'CustomerRegistration' and pass the excel data values
		//submit the 
		data=getExcelData();
		
		//Store the success message in a static variable 'successmsg'
		cust.setCustomerName(data[0]);
		cust.setAge(data[1]);
		cust.setAddress(data[2]);
		cust.setPhoneNumber(data[3]);
		cust.setEmail(data[4]);
		
		cust.SubmitForm();
		successmsg=cust.SuccessMsg();
		
	}
	
	public void closeBrowser() {
		//close the browser
		driver.close();
		
	}

	public static void main(String[] args) throws Exception {
		
		TestCustomerRegistration test=new TestCustomerRegistration();
		
		/* implement your code here */
		test.setUp();
		test.getExcelData();
		test.testValidSubmit();
		test.closeBrowser();
	}
}


