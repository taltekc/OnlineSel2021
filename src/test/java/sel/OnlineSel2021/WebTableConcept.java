package sel.OnlineSel2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableConcept {
	
	@Test
	public void tableHandling() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(200);
		driver.findElement(By.linkText("Web Table")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[3]/td[2]")).getText());
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody"));
		
		List<WebElement> row = ele.findElements(By.tagName("tr"));
		System.out.println(row.size());
		for(int i=0;i<row.size()-1;i++) {
			
			List<WebElement> cell = row.get(i).findElements(By.tagName("td"));
			for(int k=0;k<cell.size();k++) {
				
				System.out.println(cell.get(k).getText());
			}
			
			
		}
		
		
	}

}
