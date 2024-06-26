//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.*;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
package SeleniumAncester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverSetup
{ 
    static WebDriver driver;
    public static WebDriver getWebDriver()
	{
//		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
//		FirefoxBinary firefoxBinary = new FirefoxBinary();
//		firefoxBinary.addCommandLineOptions("--headless");
//	    FirefoxProfile profile=new FirefoxProfile();
//	    //profile.setPreference("marionette.logging", "TRACE");
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.setBinary(firefoxBinary);
//		firefoxOptions.setProfile(profile);
	    driver=new ChromeDriver();
	    return driver;
	}
}

