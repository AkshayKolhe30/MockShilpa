package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukariWind {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//a[@title='Search Jobs']")).click();
		
		 Set<String> allwi = driver.getWindowHandles();
		 System.out.println(allwi);
		 
		 Iterator<String> it = allwi.iterator();
		 String mainpage = it.next();
		 
		 String childpage=it.next();
		 Thread.sleep(1000);
		 driver.switchTo().window(childpage);
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.close();
		 
		 driver.switchTo().window(mainpage);
		 Thread.sleep(2000);
		 driver.close();

	}

}
