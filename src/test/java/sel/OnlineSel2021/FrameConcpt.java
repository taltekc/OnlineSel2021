package sel.OnlineSel2021;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameConcpt {
	
	@Test
	public void frameHandling() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.linkText("iFrame")).click();
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/button")).click();
		//iframe or frameset
		
		List<WebElement> st = driver.findElements(By.tagName("iframe"));
		System.out.println(st.size());
		System.out.println(driver.findElement(By.cssSelector("#page-content-wrapper > div > p")).getText());
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.cssSelector("body > div > div > div:nth-child(1) > div > h1:nth-child(3)")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector("#page-content-wrapper > div > p")).getText());
	}

}
