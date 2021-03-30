package sel.OnlineSel2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlrtHandling {

	
	@Test
	
	public void Alertdealing() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.xpath("//*[@id=\'page-content-wrapper\']/div/button[7]")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("message");
		
	}
}
