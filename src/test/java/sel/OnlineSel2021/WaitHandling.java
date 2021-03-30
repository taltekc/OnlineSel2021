package sel.OnlineSel2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitHandling {
	
	
	@Test
	public void waitTest() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//Thread.sleep(200);
		
		//Implicit wait 
		
//		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//		
//		WebElement st = driver.findElement(By.name("firstName"));
//		st.clear();
//		st.sendKeys("implicit wait");
		
		//Explicit Wait
		
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		WebElement st = driver.findElement(By.name("firstName"));
		st.clear();
		st.sendKeys("implicit wait");
		
	}

}
