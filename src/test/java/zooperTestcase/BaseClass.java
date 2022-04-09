package zooperTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	WebDriver driver;
@BeforeClass	
public void setUp()
{
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		
		
}



@AfterClass

public void tearDown()
{
	driver.close();
}
}
