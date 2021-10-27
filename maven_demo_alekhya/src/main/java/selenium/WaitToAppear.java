package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitToAppear {
	@Test
	public void appear() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/appear.html");

		boolean element = driver.findElement(By.xpath("//div[@class=\"flex\"]")).isDisplayed();
		System.out.println(element);
		if (element) {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[1]/button[5]/b")));
		}
		String button = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[1]/button[5]/b")).getText();
		System.out.println(button);
	}
}
