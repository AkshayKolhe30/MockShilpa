package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_auto {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.switchTo().frame(1);// Index
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.switchTo().defaultContent();//to switch from frame to mainpage
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Start the Exercise']")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
