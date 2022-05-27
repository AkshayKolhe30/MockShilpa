package MyPractice;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Amazon_Tc {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[4]")).click();
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> it = allwin.iterator();
		Thread.sleep(1000);
		
		String parentwn = it.next();
		driver.switchTo().window(parentwn);
		driver.close();
		Thread.sleep(1000);
		
		String childwind = it.next();
		driver.switchTo().window(childwind);
		Thread.sleep(1000);
		
		WebElement adbtn=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		js.executeScript("arguments[0].scrollIntoView();", adbtn);
		adbtn.click();
		Thread.sleep(1000);
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,-1000)", "");
		
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dsc=new File("C:\\Users\\lenovo\\Desktop\\ScreenShot\\Amazon.png");
		FileHandler.copy(src, dsc);
		
		driver.findElement(By.xpath("(//input[@class='a-color-link'])[1]")).click();
		Thread.sleep(1000);
		String txt=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText();
		//System.out.println(txt.getText());
		Assert.assertEquals("Your Amazon Cart is empty.", txt);
		Thread.sleep(1000); 
		
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File dsc1=new File("C:\\Users\\lenovo\\Desktop\\ScreenShot\\Delete1.png");
		FileHandler.copy(src1, dsc1);
		
		Thread.sleep(4000);
		driver.close();
	}

}
