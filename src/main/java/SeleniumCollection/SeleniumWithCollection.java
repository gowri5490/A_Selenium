package SeleniumCollection;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumWithCollection {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		//List<WebElement> links=driver.findElements(By.cssSelector("a"));
		List<WebElement> links=driver.findElements(By.cssSelector("a._1ch8e_ , div._1ch8e_"));
		
		int count=0;
		for(WebElement link:links)
		{
			System.out.println("Link Name: "+link.getText());
			System.out.println("Class Name: "+link.getAttribute("class"));
			System.out.println("++++++++++\n");
			count++;
		}
		
		System.out.println("Total links:"+count);
		
		driver.close();
	}

}
