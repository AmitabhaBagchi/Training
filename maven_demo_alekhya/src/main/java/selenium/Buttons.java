package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	@Test
	public void buttonfeatures() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/Button.html");
		
		
		driver.findElement(By.xpath("//button[@id=\"home\"]")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		if (title.equals("TestLeaf - Selenium Playground")) {
			System.out.println(title);
		} else {
			;
			System.out.println("not navigated");
		}
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//button[@id=\"position\"]")).isDisplayed();
		driver.findElement(By.xpath("//button[@id=\"position\"]")).isEnabled();
		driver.findElement(By.xpath("//button[@id=\"position\"]")).click();
		Point a = driver.findElement(By.xpath("//button[@id=\"position\"]")).getLocation();
		System.out.println(a);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"color\"]")).getCssValue("color");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"size\"]")).getSize();
		Thread.sleep(1000);
		driver.close();
	}
}
