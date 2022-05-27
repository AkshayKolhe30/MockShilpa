package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_ScrCap {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/buzz/viewBuzz");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbtn.click();
		
		//Scroll By Pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		//Scroll BY Element
		
		//WebElement commentbtn=driver.findElement(By.xpath("//input[@id='commentBoxNew_listId9']"));
		//js.executeScript("argments[0].scrollIntoView();", commentbtn);
		Thread.sleep(2000);
		
		//ScreenShot
		String rm=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\lenovo\\Desktop\\ScreenShot\\"+rm+".png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)","");
		
		String rm1=RandomString.make(4);
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File desn=new File("C:\\Users\\lenovo\\Desktop\\ScreenShot\\"+rm1+".png");
		FileHandler.copy(src1, desn);
		
		
		driver.close();
	}

}
