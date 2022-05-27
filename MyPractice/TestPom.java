package MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.loginpom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPom {
	WebDriver driver;
	@BeforeMethod 
	public void BM() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void VeriLogin() throws InterruptedException {
		loginpom login = PageFactory.initElements(driver, loginpom.class);
		login.getEmailid().sendKeys("Akshay");
		login.getPass().sendKeys("1233");
		login.getLogin().click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void close() {
		driver.close();
		
	}
}
