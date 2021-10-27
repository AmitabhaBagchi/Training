package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	@Test
	public void sort() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions obj = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/sortable.html");
	     
     WebElement from2 = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][2]"));
     WebElement from3 = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][3]"));
     WebElement from4 = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][4]"));
     WebElement from5 = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][5]"));
     WebElement from6 = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][6]"));
     WebElement from7 = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][7]"));
		WebElement to = driver.findElement(By.xpath("//li[@class=\"ui-state-default ui-sortable-handle\"][1]"));
		obj.dragAndDrop(from7, to).build().perform();
		obj.dragAndDrop(from6, to).build().perform();
		obj.dragAndDrop(from5, to).build().perform();
		obj.dragAndDrop(from4, to).build().perform();
		obj.dragAndDrop(from3, to).build().perform();
		obj.dragAndDrop(from2, to).build().perform();
		Thread.sleep(2000);
		//driver.close();
}	
}
		
		
		
