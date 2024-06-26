package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel {
	public static void main(String args[])throws Exception
	{
		//System.setProperty("webdriver.chrome.driver",
		//System.setProperty("webdriver.chrome.driver","C:\\Data\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Thread.sleep(1000);
		
		//WebDriverWait wait=new WebDriverWait(driver,10);
		
		//wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/"));
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Gowri");
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Kavin");
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("gowrikavin54@gmail.com");
		
		
		driver.manage().window().maximize();
		
		driver.close();
		
	}

}
