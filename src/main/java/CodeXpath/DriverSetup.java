/* IMPORTANT:- DriverSetup --getDriver()
-------------------------------------------------
PLEASE DO NOT MAKE ANY CHANGES OR MOFICATIONS IN THIS PROGRAM */
package CodeXpath;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.*;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;


public class DriverSetup
{ 
    private static WebDriver driver;
    public static WebDriver getDriver()
	{
//		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
//		FirefoxBinary firefoxBinary = new FirefoxBinary();
//		firefoxBinary.addCommandLineOptions("--headless");
//	    FirefoxProfile profile=new FirefoxProfile();
//	    FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.setBinary(firefoxBinary);
//		firefoxOptions.setProfile(profile);
//	    driver=new FirefoxDriver(firefoxOptions);
    	driver=new ChromeDriver();
	    String baseUrl = "https://webapps.tekstac.com/Cargo_Shipping_Cost/";
	    driver.get(baseUrl);
	    return driver;
	}
}

