package sel.OnlineSel2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssConcept {
	
	
	@Test
	public void assConcept() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Sign In1")) {
			
			System.out.println("Valid title ");
		}else
		{
			System.out.println("Invalid title ");
		}		
	
		
		Assert.assertEquals(title, "Sign In");
		
		System.out.println("This is next line ");
	}

}
