package sel.OnlineSel2021;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
	@Test
	public void handlingWindow() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.linkText("New Tab")).click();
		driver.findElement(By.cssSelector("#page-content-wrapper > div > button")).click();
		System.out.println(driver.getTitle());
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String newTab = it.next();
		String itTraining=it.next();
		driver.switchTo().window(itTraining);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(newTab);		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
