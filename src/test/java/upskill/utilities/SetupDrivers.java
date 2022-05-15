package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static WebDriver driver;         					//Initializing driver
	
	public static void setupDriver(){
//		System.setProperty("webdriver.chrome.driver", "C:\\UpSkillSoftware\\chromedriver.exe");		//Getting physical chrome drive
		WebDriverManager.chromedriver().setup();				//Getting Chrome driver form cloud
		ChromeOptions options = new ChromeOptions();			//Initializing Chrome options
		options.addArguments("--start-maximized");				//Adding arguments
		options.addArguments("--disable-notifications");		//Adding arguments
		//options.addArguments("--headless");						//Headless execution
		driver = new ChromeDriver(options);						//Declaring driver value
		driver.get("https://www.ebay.com/");					//Loading the Webpage
	}
	
	public static WebDriver getDriver(){
		return driver;											//Returning driver to call
	}
	
	public static void tearDownDriver(){
		driver.close();											//Closing current driver session
		driver.quit();											//Closing all driver session
	}
	
}
