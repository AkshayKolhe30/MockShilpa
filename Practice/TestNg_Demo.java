package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Demo {
	
	
	 public WebDriver driver;
	
	@BeforeMethod
	public void BM() throws Exception {
		System.out.println("Before Method");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Akshay");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("aksh123");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		Thread.sleep(2000);
	}
	@Test
	public void Test1() {
		System.out.println("Test11");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
		driver.close();
	}
}
