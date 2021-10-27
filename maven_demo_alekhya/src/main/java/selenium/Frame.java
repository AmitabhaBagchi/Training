package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	@Test
	public void frm() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));
		a.click();
		System.out.println(a.getText());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame(1).switchTo().frame(driver.findElement(By.id("frame2")));
		WebElement b = driver.findElement(By.xpath("//button[@id='Click1']"));
		b.click();
		System.out.println(b.getText());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		List<WebElement> c = driver.findElements(By.tagName("iframe"));
		System.out.println(c.size());
		driver.close();

	}
}
