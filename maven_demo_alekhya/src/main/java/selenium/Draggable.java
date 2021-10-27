package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
	@Test
	public void drag() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions obj = new Actions(driver);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/drag.html");
		WebElement from = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement to = driver.findElement(By.xpath("//li[@id=\"text-2\"]"));
		obj.dragAndDrop(from, to).build().perform();
		Thread.sleep(1000);
		
	}
}
