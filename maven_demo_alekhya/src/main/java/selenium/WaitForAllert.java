package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAllert {
	@Test
	public void ger() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/alertappear.html");
		 
		WebElement a = driver.findElement(By.xpath("//button[@id=\"alert\"]"));
		a.click();
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
