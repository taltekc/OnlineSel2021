package sel.OnlineSel2021.annonnation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Utility {
	
	WebDriver driver;
	//@BeforeMethod
	public void before() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("http://qa.taltektc.com");
//		driver.manage().window().maximize();
		
		System.out.println("Open Browser");
	}

	//@AfterMethod
	public void after() {
		//driver.quit();
		System.out.println("Close browser");
	}
	
	//@BeforeClass
	public void bClass() {
		
		System.out.println("This is before class annonation ");
	}
	
	//@AfterClass
	public void aClass() {
		
		System.out.println("This is after class annonation ");
	}
	
	@BeforeTest
	public void bTest() {
		
		System.out.println("Run before test ");
	}
	
	@AfterTest
	public void aTest() {
		
		System.out.println("Run after test");
	}
	
	
	@BeforeSuite
	public void bSuite() {
		
		System.out.println("This is before any cases");
	}
	
	@AfterSuite	
	public void aSuite() {
		System.out.println("After all cases");
	}
	
	
	
}
