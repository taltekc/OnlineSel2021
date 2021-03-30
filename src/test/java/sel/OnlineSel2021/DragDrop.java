package sel.OnlineSel2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	
	
	@Test
	public void dropConcept() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		List<WebElement> st = driver.findElements(By.tagName("iframe"));
		System.out.println(st.size());
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).getText());
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(source, drop).build().perform();
		driver.quit();
		
	}

}
