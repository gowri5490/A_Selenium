package SeleniumFrames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

public class HandleBrowserWindows {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		List<String> windowList=new ArrayList(windowIds);
		
		String parentWindowId=windowList.get(0);
		
		String childWindowId=windowList.get(1);
		
		driver.switchTo().window(parentWindowId);
		
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		uname.click();
		
		uname.sendKeys("Kavin");
		
		driver.switchTo().window(childWindowId);
		
		WebElement spage=driver.findElement(By.xpath("//input[@name='EmailHomePage']"));
		
		spage.click();
		
		spage.sendKeys("gowrikavin54@gmail.com");
		
		
	}

}
