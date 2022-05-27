package MyPractice;

import java.io.File;
import java.io.IOException;

import org.bouncycastle.jcajce.provider.symmetric.Serpent.TSerpentGMAC;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_TC {

	@Test
	public void Amaz() throws InterruptedException, Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement acclist=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act=new Actions(driver);
		act.moveToElement(acclist).build().perform();
		WebElement Youracc=driver.findElement(By.xpath("//span[text()='Your Account']"));
		act.moveToElement(Youracc).build().perform();
		TakesScreenshot sc=(TakesScreenshot) driver;
		act.click(Youracc).perform();
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dsc= new File("C:\\Users\\lenovo\\Desktop\\ScreenShot\\Youracc.png");
		FileHandler.copy(src, dsc);
		
		Thread.sleep(3000);
		
		
		
		driver.close();
	}
}
