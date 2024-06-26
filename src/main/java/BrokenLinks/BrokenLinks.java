package BrokenLinks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLinks {
	
	public static void main(String args[]) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		//URL ur=new URL("https://www.google.com/search?q=erode&rlz=1C1GCEW_enIN1094IN1095&oq=Erode&gs_lcrp=EgZjaHJvbWUqBwgAEAAYjwIyBwgAEAAYjwIyDQgBEC4YgwEYsQMYgAQyCggCEAAYsQMYgAQyEAgDEAAYgwEYsQMYgAQYigUyDQgEEAAYgwEYsQMYgAQyBwgFEAAYgAQyEAgGEAAYgwEYsQMYgAQYigUyEAgHEAAYgwEYsQMYgAQYigUyEAgIEAAYgwEYsQMYgAQYigUyDQgJEC4YrwEYxwEYgATSAQgxODA1ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
		driver.get("https://www.google.com/search?q=erode&rlz=1C1GCEW_enIN1094IN1095&oq=Erode&gs_lcrp=EgZjaHJvbWUqBwgAEAAYjwIyBwgAEAAYjwIyDQgBEC4YgwEYsQMYgAQyCggCEAAYsQMYgAQyEAgDEAAYgwEYsQMYgAQYigUyDQgEEAAYgwEYsQMYgAQyBwgFEAAYgAQyEAgGEAAYgwEYsQMYgAQYigUyEAgHEAAYgwEYsQMYgAQYigUyEAgIEAAYgwEYsQMYgAQYigUyDQgJEC4YrwEYxwEYgATSAQgxODA1ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
		//driver.navigate().to(ur);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links"+links.size());
		
		int brokenlinks=0;
		
		for(WebElement link:links)
		{
			String linkname=link.getAttribute("href");
			
			if(linkname==null || linkname.isEmpty())
			{
				System.out.println("Link(href) value is empty");
				continue;
			}
			
			//Checking link is broken or not
			URL linkUrl=new URL(linkname);
			
			HttpURLConnection con=(HttpURLConnection) linkUrl.openConnection();
			
			con.connect();
			
			if(con.getResponseCode()>=400)
			{
				System.out.println(linkname+"   "+"-----> Broken link");
				brokenlinks++;
			}
			else
			{
				System.out.println(linkname+"   "+"-----> Not Broken link");
			}
		}
		System.out.println("Total no of broken links:"+brokenlinks);
	}
	
}