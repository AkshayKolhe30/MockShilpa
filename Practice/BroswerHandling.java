package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BroswerHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		Iterator<String> it=allwindow.iterator();
		String mainpage=it.next();
		
		String childpage=it.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(childpage);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("aks");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainpage);
		Thread.sleep(1000);
		driver.close();

	}

}
