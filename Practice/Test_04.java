package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_04 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		//auto suggestion
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		//System.out.println(list.size());
		Thread.sleep(2000);
		list.get(0).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Chennai");
		List<WebElement> lis=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		Thread.sleep(1000);
		lis.get(0).click();
		
		
		
		
		
		
		
	}

}
