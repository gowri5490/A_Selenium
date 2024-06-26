package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;


public class Se_ByName_ByClass {
	public static void main(String args[])throws Exception
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Airpods");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='Apple AirPods (2nd Generation) Case, White']")).click();
		
		driver.findElement(By.partialLinkText("Apple AirPods (2nd Generation) Case, White")).click();
		
		Thread.sleep(2000);
		
		String productTitle=driver.findElement(By.xpath("//span[normalize-space()=\"Apple AirPods (2nd Generation) Case, White\"]")).getText();
		
		String productPrice=driver.findElement(By.xpath("//span[normalize-space()=\"9,999\"]")).getText();
		
	
		System.out.println("ProductTitle:"+productTitle);
		System.out.println("ProductPrice:"+productPrice);
	}
	

}
