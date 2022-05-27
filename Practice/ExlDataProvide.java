package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExlDataProvide {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\lenovo\\Desktop\\SelData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		String data2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(data2);
		Thread.sleep(1000);
		
		
		
		driver.close();
		
		
	}

}
