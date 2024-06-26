package SeleniumCollection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeadlessBrowser {
	public static void main(String args[])
	{
		//WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		
		//options.setHeadless(true);
		
	
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("Pke_EE")).click();
		
		driver.findElement(By.className("Pke_EE")).sendKeys("Mens Casual Shoes");
		
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		
		//price=div.hl05eU
		
		//div.hCKiGj div.hl05eU:first-child
		
		List<WebElement> items=driver.findElements(By.cssSelector("div.hCKiGj"));
		
		for(WebElement item:items)
		{
			String item1=item.findElement(By.cssSelector("div.hCKiGj div.hl05eU:first-child")).getText();
			
			String[] item2=item1.split("₹");
			
			String cost=item2[1];
			
			String item3=cost.replace(",", " ").replace(" ", "");
			
			
			Double price=Double.parseDouble(item3);
			
			if(price>1000.0)
			{
				WebElement productTitle=item.findElement(By.cssSelector("div.hCKiGj a"));
				
				System.out.println("ProductTitle: "+productTitle.getText());
				
				System.out.println("ProductPrice: "+price);
				
				System.out.println(productTitle.getAttribute("href"));
				
				System.out.println("******************");
		}
			
			
		} 
		//System.out.println(item1);
		
		//System.out.println(price);
		//System.out.println("***********");
		
		driver.close();
		
	}

}
