package sel.OnlineSel2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDown {
	
	@Test
	public void dropDown() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com/home/signup");
		driver.manage().window().maximize();//Max window 
		
		//WebElement month = driver.findElement(By.name("month"));
		Select sel1=new Select(driver.findElement(By.name("month")));//month
		
		//sel1.selectByVisibleText("Jun");
		//sel1.selectByIndex(5);
		sel1.selectByValue("06");
	}

}
