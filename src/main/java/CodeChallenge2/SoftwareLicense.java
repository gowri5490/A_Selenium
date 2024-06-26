package CodeChallenge2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SoftwareLicense {   // Do not change class name
    
    // Use the below declarations
    static WebDriver driver;
	static WebElement element;
	static Select select;

	static String licenseText;
	static String pageTitle;
	
	public WebDriver setDriver() {
	    
		// Create the driver using 'getDriver' method. Assign it to variable 'driver'
		// Return the variable driver
		driver=DriverSetup.getDriver();
		
		return driver;
	
	}
	
	public void navigateToURL() {
	    
	    // navigate to baseUrl 'https://webapps.tekstac.com/SoftwareLicence/'
	    
	   String baseUrl = "https://webapps.tekstac.com/SoftwareLicence/";
	   driver.get(baseUrl);
	   
	}
	
	public void getHeadingTitleText() {
	    
	    // Get the heading title text of the application page. Assign the text to the static variable 'pageTitle'
	    pageTitle=driver.findElement(By.xpath("//h2[normalize-space()='Software Licence Details']")).getText();
	    
	}
	
	
	public void setName(String name) {
		
		// Find the form elements using Locators and select the values.
		// select an Software name from the drop down based on the 'name' parameter passed.
		
		select=new Select(driver.findElement(By.xpath("//select[@id='licenceName']")));
		
		select.selectByValue(name);
		

	}

	public void setQuantity(String quantity) {
	    
		// Find Number of Licenses element using ID locator and fill with Quantity
		driver.findElement(By.id("quantity")).sendKeys(quantity);
	}
	
	public String getLicenseDetails() {
		
		// Find Result text using ID locator 
		// Store the result text in a static variable 'licenseText' and return it.
		WebElement txt=driver.findElement(By.id("result"));
		
		licenseText=txt.getText();
		
		return licenseText;
		
	
	}
	
	public void refreshPage() {
	    
	    // refresh the page using refresh() method
	    driver.navigate().refresh();

	}
	
    public void closeBrowser() {
        
	   //close browser
	   driver.close();
	  
    }
    

	public static void main(String[] args){
		
		SoftwareLicense softwarelicense=new SoftwareLicense();
		
        //Add required code
        
        //Invoke the method setDriver()
        //Invoke the method navigateToURL()
        //Invoke the method getHeadingTitleText()
        
        softwarelicense.setDriver();
        
        softwarelicense.navigateToURL();
        
        softwarelicense.getHeadingTitleText();
        
		//Invoke the method setName() with software name (for ex. "Eclipse Public License")
		//Invoke the method setQuantity() with parameter quantity value
		//Invoke the method getLicenseDetails()
		
		softwarelicense.setName("Eclipse Public License");
		
		softwarelicense.setQuantity("2");
		
		softwarelicense.getLicenseDetails();
 		//Invoke the method refreshPage()
 		
 		softwarelicense.refreshPage();
 		//Invoke the method setName() with different software name (for ex. "Apache License 2.0")
		//Invoke the method setQuantity() with parameter quantity value
		//Invoke the method getLicenseDetails()
 		softwarelicense.setName("Apache License 2.0");
 		
 		softwarelicense.setQuantity("4");
 		
 		softwarelicense.getLicenseDetails();
 		
		//Invoke the method closeBrowser()
		
		softwarelicense.closeBrowser();
		
	}
}




