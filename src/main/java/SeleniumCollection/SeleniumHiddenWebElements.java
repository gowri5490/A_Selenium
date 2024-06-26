package SeleniumCollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SeleniumHiddenWebElements {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.partialLinkText("Google")).click();
		List<WebElement> links=driver.findElements(By.cssSelector("a , link[rel]"));
		
		System.out.println("Total Links: "+links.size());
		int count=0;
		for(WebElement link:links)
		{
			String text=link.getText();
			if(!text.trim().isEmpty())
			{
			System.out.println("Link Name:"+link.getText());
			
			System.out.println("Class Name:"+link.getAttribute("class"));
			
			if(link.isDisplayed())
			{
				count++;
			}
			
		}
			
		}
		System.out.println(count);
		driver.close();
	}

}
