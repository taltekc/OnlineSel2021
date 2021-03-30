package sel.OnlineSel2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	public void handleBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();//Max window 
		
//		String title=driver.getTitle();
//		if(title.equalsIgnoreCase("Sign In1")) {
//			System.out.println("we are in  right page");
//		}
//		else
//		{
//			System.out.println("we are not in right page ");
//		}
		
		//Xpath Technique 
		
//		driver.findElement(By.xpath("//*[@id='login_form']/input[1]")).sendKeys("Hasan1@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\'login_form\']/input[2]")).sendKeys("Iqbal1234");
//		driver.findElement(By.xpath("//*[@id=\'login_form\']/input[3]")).click();
		
		//Tagname[@Att='value']
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(200);
		
		//Name Technique
		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys("New Value");
		
		
		//ID Technique
		
		driver.findElement(By.id("female")).click();
		
		
		//Link Text
		
		//driver.findElement(By.linkText("Drag & Drop")).click();
		
		//Partial Link Text
		
		//driver.findElement(By.partialLinkText("Drag &")).click();
		
		
	}
	

}
