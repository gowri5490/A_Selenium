package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Meesho {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("Shoes");
		WebElement ser=driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code' and @value='Shoes']"));
		ser.sendKeys(Keys.ENTER);
	}

}
