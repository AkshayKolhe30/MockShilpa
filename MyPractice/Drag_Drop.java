package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
	@Test
	public void drag() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement srce=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement desti=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement sorce=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destin=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, des).build().perform();
		Thread.sleep(4000);
		act.dragAndDrop(src, dest).build().perform();
		Thread.sleep(4000);
		act.dragAndDrop(srce, desti).build().perform();
		Thread.sleep(4000);
		act.dragAndDrop(sorce, destin).build().perform();
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
