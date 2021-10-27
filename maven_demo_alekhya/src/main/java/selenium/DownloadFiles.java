package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFiles {
	@Test
	public void download() throws InterruptedException, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/download.html");

		driver.findElement(By.xpath("//a[@href=\"../testleaf.xlsx\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"../testleaf.pdf\"]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href=\"../testleaf.txt\"]")).click();
		//driver.findElement(By.xpath("//a[@href=\"../testleaf.pdf\"]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
}
