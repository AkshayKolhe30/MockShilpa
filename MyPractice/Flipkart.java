package MyPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8669372727");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("deepak26");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[4]")).click();
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> it = allwin.iterator();
		Thread.sleep(2000);
		
		String parentwn = it.next();
		driver.switchTo().window(parentwn);
		driver.close();
		Thread.sleep(6000);
		
		String childwn = it.next();
		driver.switchTo().window(childwn);
		Thread.sleep(2000);
		
		WebElement adbtn=driver.findElement(By.xpath("//*[text()='ADD TO CART']"));
		js.executeScript("arguments[0].scrollIntoView();", adbtn);
		adbtn.click();
		Thread.sleep(1000);
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,-1000)", "");
		
		
		//driver.close();
	}
	

}
