package sel.OnlineSel2021;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OtherMethod {
	
	CommonData data=new CommonData();
	
	@Test
	public void displayMethod() throws InterruptedException, IOException {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\browser\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("http://qa.taltektc.com");
//	driver.manage().window().maximize();
	
	//
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.userName);
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.password);
//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	
	//Properties File
	
//	FileInputStream file=new FileInputStream("C:\\Users\\hasan\\eclipse-workspace\\OnlineSel2021\\Test.properties");
//	Properties prof=new Properties();
//	prof.load(file);
//	
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prof.getProperty("userName"));
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prof.getProperty("password"));
//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	//Read data from Excel
	
	FileInputStream file=new FileInputStream("C:\\temp\\Test.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	DataFormatter format=new DataFormatter();
	//System.out.println(sheet.getRow(0).getCell(0));
//	Object user=format.formatCellValue(sheet.getRow(0).getCell(0));
//	
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user.toString());
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(format.formatCellValue(sheet.getRow(0).getCell(0)));
//
//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	Iterator<Row> it = sheet.iterator();
	while(it.hasNext()){
		Row row = it.next();
		Iterator<Cell> col = row.iterator();
		while(col.hasNext()) {
			
			System.out.println(format.formatCellValue(col.next()));
			
		}
		
	}
	
	
	
//	Thread.sleep(200);
//	
//	
//	WebElement ele = driver.findElement(By.id("male"));
//	
//	System.out.println(ele.isDisplayed());
//	System.out.println(ele.isSelected());
//	System.out.println(ele.isEnabled());
//	
	}
	
	
	
	

}
