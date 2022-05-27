package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email_Tc {


	@Test
	public void email() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(mail).click().build().perform();
		
		Thread.sleep(4000);
		driver.close();
	}
}
