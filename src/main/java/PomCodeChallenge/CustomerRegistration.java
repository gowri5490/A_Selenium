package PomCodeChallenge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerRegistration {
    
	public static WebDriver driver;
	public static WebElement element;
	
	//idetify each element using its respective locators
	//eg:By name=By.name("name");
	
	public CustomerRegistration(){}
	
	//DO NOT change the constructor
	public CustomerRegistration(WebDriver driver) {
		this.driver= driver;
	}
    
    public void setCustomerName(String name) {
		// Locate the Web Element corresponding to the ‘Customer Name’ (TextField) using specific locators.            
		// Pass the name as a parameter to this method                                               
		// Use the sendKeys() method and fill the input box of the 'Customer Name' with 'name'
		driver.findElement(By.name("cname")).sendKeys(name);
	}	
    public void setAge(String age) {
		// Locate the Web Element corresponding to the ‘Age’ (TextField) using specific locators.            
		// Pass the age as a parameter to this method                                               
		// Use the sendKeys() method and fill the input box of the ‘Age' with 'age'
		driver.findElement(By.name("age")).sendKeys(age);
	}

	public void setAddress(String address) {
		// Locate the Web Element corresponding to the ‘Address’ (TextField) using specific locators.            
		// Pass the address as a parameter to this method                                               
		// Use the sendKeys() method and fill the input box of the 'Address' with 'address'
		
		driver.findElement(By.name("address")).sendKeys(address);
	}	 	  	  		 	     	     	      	 	

	public void setPhoneNumber(String phone) {
		// Locate the Web Element corresponding to ‘Phone Number’ (TextField) using specific locators.
		// Pass the phone as a parameter to this method                       
		// Use the sendKeys() method and fill the input box of the 'Phone Number' with ‘phone’.
		driver.findElement(By.name("phonenumber")).sendKeys(phone);
	}

	public void setEmail(String email) {
		// Locate the Web Element corresponding to the ‘Email’ using specific locators.                                 
		// Pass the email as a parameter to this method.                                               
		// Use the sendKeys() method and fill the input box of the 'Email' with ‘email'
		
		driver.findElement(By.name("email")).sendKeys(email);
	}

	
	public void SubmitForm() {
		// Locate the Web Element corresponding to the ‘Submit’ (Button) using specific locators.
		// Click the ‘Submit’ button and submit the form.
		element=driver.findElement(By.xpath("//input[@id='submit']"));
		
		element.click();
	}
	
	public String SuccessMsg() {
		// Locate the Web Element corresponding to the ‘Success Message’ using specific locators.
		// return the ‘Success Message’ displayed after submit the form.
		WebElement msg=driver.findElement(By.xpath("//h2"));
		
		
		return msg.getText();
	}
	

}

