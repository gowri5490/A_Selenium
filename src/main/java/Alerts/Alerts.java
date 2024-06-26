package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		
//		//Alert alrtWd=driver.switchTo().alert();
//		
//		Alert alrtWd=wait.until(ExpectedConditions.alertIsPresent());
//		
//		System.out.println(alrtWd.getText());
//		
//		alrtWd.accept();
//		
//		alrtWd.dismiss();
		
		driver.get("https://www.google.com");
		
				
				
	}

}
