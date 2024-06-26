package SeleniumFrames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		//Frame 1 to enter the text
		WebElement fram1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(fram1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Kavin");
		
		//if you want to switch one frame to another frame should use defaultContent
		
		driver.switchTo().defaultContent();
		
		//Frame2 
		
		WebElement fram2=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(fram2);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Gowrisankar");
		
		//if we switch frames inside frame(iframe) no need defaultContent
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector(".YEVVod")).click();
		
	}

}
