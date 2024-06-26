package ScreenShots;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File scr=ts.getScreenshotAs(OutputType.FILE);
		
		File otf=new File("C:\\Users\\2318300\\eclipse-workspace\\A_ScrrenShots\\ScreenShot\\ScreenShot.png");
		
		FileUtils.copyFile(scr, otf);
	
		
//		WebElement ele=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']"));
//		
//		File src=ele.getScreenshotAs(OutputType.FILE);
//		
//		File trg=new File("C:\\\\Users\\\\2318300\\\\eclipse-workspace\\\\A_ScrrenShots\\\\ScreenShot\\\\ScreenShot.png");
//		
//		FileUtils.copyFile(src, trg);
		
	}

}
