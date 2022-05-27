package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyB_Action {

	@Test
	public void keyba() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
		act.keyDown(email,Keys.SHIFT).sendKeys("Akshay").keyUp(Keys.SHIFT).build().perform();
		
		//contr+A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
		
		//contr+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.SHIFT).build().perform();
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.SHIFT).build().perform();
		
		
	}
}
