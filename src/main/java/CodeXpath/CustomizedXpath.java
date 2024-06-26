package CodeXpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomizedXpath { // Do not change 
    
    // Use the below declarations
    static WebDriver driver;
	static int textBoxcount,labelsCount,buttonCount,radiobuttonCount, linkCount;  
    static String result; // Store the success message after form submit in this variable
    
    static List<WebElement> textBoxList,labelsList,buttonList, radioButtonList, linksList; 
	By textBoxXpath, labelXpath1, labelXpath2, buttonXpath, radiobuttonXpath, linkXpath1, linkXpath2;


	public WebDriver setDriver(){ 
	    
		/*Invoke the Webdriver*/
		/*store it in static variable 'driver' and return it*/
		driver=DriverSetup.getDriver();
		return driver;
	}
	
	
	public void setNewFormValues(String weight, String transportMode) {  
	    
	    // Get the weight and the transport mode passed as parameter.
	   
    	
    	// The transportMode can be either Air/Road/Ship
    	// Based on the transportMode, click the radio button. 
        // For ex: If transportMode is "Air" choose the 'air' radio button
        
        // Submit the form
    	
    	// After submit, find the element of the message displayed and get the text.
    	
    	// Store the retrieved text in 'result' static variable.
    	 WebElement weightElement = driver.findElement(By.xpath("//input[@id='weight']"));
        weightElement.sendKeys(weight);

        if(transportMode.equals("Air"))
	    {
	    	WebElement transportModeElement=driver.findElement(By.id("air"));
	    	 transportModeElement.click();
	    }
	    else if(transportMode.equals("Road"))
	    {
	    	WebElement transportModeElement=driver.findElement(By.id("road"));
	    	transportModeElement.click();
	    }
	    else if(transportMode.equals("Ship"))
	    {
	    	WebElement transportModeElement=driver.findElement(By.id("ship"));
	    	transportModeElement.click();
	    	
	    }
	    
        
       

        WebElement calculateButton = driver.findElement(By.xpath("//button[@id='calculate']"));
        calculateButton.click();

        WebElement re = driver.findElement(By.xpath("//div[@id='result']"));
        
        result=re.getText();
		
	}

	
	public List<WebElement> textBoxCount() {
	    
		// Identify the text fields by customized xpath and print how many text boxes in the page using List
		
		// Assign your locator to 'textBoxXpath' variable and use that to locate the element
		// Get the list of all text boxes and store that in a list 'textBoxList' ( Use customized xpath locator to identify the elements )

		// Get the size of the 'textBoxList' (total text box count) and store it in a static variable 'textBoxcount' then print it
		
		// Return the list 'textBoxList'
		List<WebElement> textBoxList = driver.findElements(By.xpath("//input[@type='text']"));
        textBoxcount = textBoxList.size();
        System.out.println("Total text box count: " + textBoxcount);
        return textBoxList;
		
	}	 	  	  		 	     	     	      	 	
	
	
	public List<WebElement> labelsCount() {
	    
		// Identify the text field labels by customized xpath and print how many labels in the page using List
		
		// Assign your locator to labelXpath1 variable and use that to locate the first label 'Weight(in kg)'
		// Assign your locator to labelXpath2 variable and use that to locate the second label of 'Transport Mode'
	
	    // Get the list of all labels and store that in a list 'labelsList' (Use customized xpath locator to identify the elements)
       
        // Get the size of the 'labelsList' (total label count) and store it in a staic variable 'labelsCount' then print it
        
		// Return the list 'labelsList'
		List<WebElement> labelsList = driver.findElements(By.xpath("//td[normalize-space()='Weight(in kg)' or normalize-space()='Transport Mode']"));
        labelsCount = labelsList.size();
        System.out.println("Total label count: " + labelsCount);
        return labelsList;
	
	}

	public List<WebElement> buttonCount() {
	    
		// Identify the button by customized xpath and print how many buttons in the page using list 
		
		// Assign your locator to 'buttonXpath' variable and use that to locate the element
	    // Get the list of all buttons and store that in a list 'buttonList' ( Use customized xpath locator to identify the elements )
	
		// Get the size of the 'buttonList' (total button count) and store it in a static variable 'buttonCount' then print it
		
		// Return the list 'buttonList'
		List<WebElement> buttonList = driver.findElements(By.xpath("//button"));
        buttonCount = buttonList.size();
        System.out.println("Total button count: " + buttonCount);
        return buttonList;

	}	 	  	  		 	     	     	      	 	
	
	public List<WebElement> radiobuttonCount() {
	    
		// Identify the radio buttons by customized xpath and print how many radio buttons in the page using list 
		
		// Assign your locator to 'radiobuttonXpath' variable and use that to locate the element
		// Get the list of all radio buttons and store it in a variable 'radioButtonList' ( Use customized xpath locator to identify the elements )
		
		// Get the size of the 'radioButtonList' (total radio button count) and store it in a static variable 'radiobuttonCount' then print it
		
		// Return the list 'radioButtonList'
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
        radiobuttonCount = radioButtonList.size();
        System.out.println("Total radio button count: " + radiobuttonCount);
        return radioButtonList;
		
	}
	
	
	public List<WebElement> linkCount() {
	    
		// Identify the links by customized xpath and print how many links in the page using List
		
		// Assign your locator to linkXpath1 variable and use that to locate the first link 'Sign up'
		// Assign your locator to linkXpath2 variable and use that to locate the second link of 'Log in'
	    
	    // Get the list of all links and store that in a list 'linksList' ( Use customized xpath locator to identify the elements )
        
        // Get the size of the 'linksList' (total link count) and store it in a static variable 'linkCount' then print it
        
		// Return the list 'linksList'
		List<WebElement> linksList = driver.findElements(By.xpath("//a"));
        linkCount = linksList.size();
        System.out.println("Total link count: " + linkCount);
        return linksList;
		
		
	}

	public void closeBrowser(){
	    
		//close browser
		driver.close();
	}


	public static void main(String[] args){
		
		CustomizedXpath printoptions=new CustomizedXpath();
		//Add required code
		
		
		// Call the method setDriver();
		printoptions.setDriver();
		printoptions.textBoxCount();
        printoptions.labelsCount();
        printoptions.buttonCount();
        printoptions.radiobuttonCount();
        printoptions.linkCount();
        printoptions.setNewFormValues("100", "Air");
        printoptions.closeBrowser();
		// Call the method textBoxCount() and print the size of the list returned
		// Call the method labelsCount() and print the size of the list returned
		// Call the method buttonCount() and print the size of the list returned
	    // Call the method radiobuttonCount() and print the size of the list returned
		// Call the method linkCount() and print the size of the list returned
		
		// Call the method setNewFormValues with weight and transport mode. 
	
		
	}	 	  	  		 	     	     	      	 	

}




