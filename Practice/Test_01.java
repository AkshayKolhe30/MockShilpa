package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_01 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		identify webelement
//	WebElement emailid=driver.findElement(By.id("email"));
//	emailid.sendKeys("AkshayKolhe");
//	
//	//password
//	WebElement pass=driver.findElement(By.name("pass"));
//	pass.sendKeys("12345999");
//	
//	WebElement loginbt= driver.findElement(By.name("login"));
//	loginbt.click();
	
	WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
	email.sendKeys("Deepakkadam");
	
	WebElement pass =driver.findElement(By.xpath("//*[@id='pass']"));
	pass.sendKeys("Deepak@1234");
	
	WebElement loginb= driver.findElement(By.name("login"));
	loginb.click();
	}

}
