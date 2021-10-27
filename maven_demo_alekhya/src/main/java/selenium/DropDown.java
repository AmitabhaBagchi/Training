package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	@Test
	public void dropdowns() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/Dropdown.html");

		Select index = new Select(driver.findElement(By.xpath("//select[@id=\"dropdown1\"]")));
		index.selectByIndex(1);

		Select text = new Select(driver.findElement(By.xpath("//select[@name=\"dropdown2\"]")));
		text.selectByVisibleText("Selenium");

		Select value = new Select(driver.findElement(By.xpath("//select[@id=\"dropdown3\"]")));
		value.selectByValue("1");

		List<WebElement> a = driver
				.findElements(By.xpath("//*[text()=\"Get the number of dropdown options\"]/../option"));
		System.out.println(a.size());

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[2]")).click();

	}
}
