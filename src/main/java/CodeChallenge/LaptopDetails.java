package CodeChallenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopDetails { //DO NOT change the class name
    
    // Use the below declared variables
	public static WebDriver driver;
	public static WebElement element;

	public WebDriver createDriver() { // Do not change the method signature 
	    
		// Create driver, store in in static variable 'driver' and return it
		driver=DriverSetup.getWebDriver();
		return driver;
	}
	
	public void NavigatetoAddProduct() { // Do not change the method signature 
	
	    //https://webapps.tekstac.com/LaptopDetails/addProduct.html
	    // Navigate to the AddProduct link
	   driver.findElement(By.cssSelector(".nav-item.dropdown")).click();
	   
	   driver.findElement(By.cssSelector(".dropdown-item")).click();
	    
	   // sl.selectByVisibleText("Add Product");
	   //driver.navigate().to("https://webapps.tekstac.com/LaptopDetails/addProduct.html");
	    
	}
	
	
	public void AddProduct(String prodId,String prodName,String prodDesc,String prodModel,String prodPrice) { // Do not change the method signature 
	    
	    
	    // Find the form elements and set values by passing those values from 'main' method. 
	    // Submit form to add the product details
	    
	    driver.findElement(By.id("productId")).sendKeys(prodId);
	    driver.findElement(By.id("productName")).sendKeys(prodName);
	    driver.findElement(By.id("productDesc")).sendKeys(prodDesc);
	    driver.findElement(By.id("productModel")).sendKeys(prodModel);
	    driver.findElement(By.id("productPrice")).sendKeys(prodPrice);
	    
	    driver.findElement(By.id("productBtn")).click();
		 
	}	 	  	  		 	     	     	      	 	
		
		
	public String GetProductName() { // Do not change the method signature
	    
		// Find the text of the 'product name' displayed after submit and return it
		String productName=driver.findElement(By.cssSelector("p.card-text")).getText();
		
		return productName;
		
		
	}
    	
    	
    public String GetProductPrice() { // Do not change the method signature
    	
    	// Find the text of the 'product price' displayed after submit and return it
    	
    	String productPrice=driver.findElement(By.cssSelector("a.btn.btn-primary")).getText();
    	
    	return productPrice;
		 
	}
		
	public void closeBrowser() { // Do not change the method signature
	    
		// Close the browser
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception{  
    	
        LaptopDetails obj = new LaptopDetails();
        
        // Add your code here 
        driver=obj.createDriver();
        
        obj.NavigatetoAddProduct();
        
        obj.AddProduct("101","HP","HP 14 10th Gen HD Laptop","172V2PA","52000");
        
        obj.GetProductName();
        
        obj.GetProductPrice();
            

    }  
  
}  	 	  	  		 	     	     	      	 	
