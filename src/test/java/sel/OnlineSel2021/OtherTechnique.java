package sel.OnlineSel2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OtherTechnique {
	
	
	@Test
	public void otherTec() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();//Max window 
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hasan1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iqbal1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(200);
		
		//CSS Technique
		
//		WebElement le = driver.findElement(By.cssSelector("input[name='firstName']"));
//		le.clear();
//		le.sendKeys("UpdateName");
		
		//Tagname[@attribute='value']
		
		//(tagname[att='value'])
		
		////form[@id='profile_form']/div[3]/div[1]/input
		
		
		
//		WebElement le = driver.findElement(By.xpath("//form[@id='profile_form']/div[3]/div[1]/input"));
//		le.clear();
//		le.sendKeys("UpdateName");
		
		
		//Tag name Technique
		
//		System.out.println(driver.findElement(By.tagName("legend")).getText());
//		
//		System.out.println(driver.findElement(By.xpath("//*[@id=\'profile_form\']/div[3]/div[1]/input")).getAttribute("value"));
		
		
		//Breaking xpath
		
//		String part1="//*[@id=\"sidebar-wrapper\"]/div[2]/a[";
//		String part2="]";
//		for(int i=1;i<=10;i++) {
//			
//			String completepath=part1+i+part2;
//			System.out.println(driver.findElement(By.xpath(completepath)).getText());
//		}
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/div[2]/a[i]")).getText());
		}
	
	
		
		
		
	}
	
	

}
