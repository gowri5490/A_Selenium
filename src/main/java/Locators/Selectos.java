package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Selectos {

	public static void main(String args[]) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("a#nav-hamburger-menu")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Echo & Alexa")).click();
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[normalize-space()=\"See all devices with Alexa\"]")).click();
		
		//Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("ul[class='hmenu hmenu-visible hmenu-translateX'] li:nth-child(3) a:nth-child(1)")).click();
		
		Thread.sleep(1000);
		
		//String title=driver.findElement(By.cssSelector("span#productTitle")).getText();
		
		//if(title.contains("Amazon Echo Dot"))
		//{
			//System.out.println("Pass");
		
		//}
		//else
		//{
			//System.out.println("Fail");
		//}
	}
}
