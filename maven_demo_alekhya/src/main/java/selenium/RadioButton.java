package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	@Test
	public void HandlingRadioButton() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id=\"yes\"]")).click();

		boolean check = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"))
				.isSelected();
		System.out.println(check);

		boolean age = driver.findElement(By.xpath("//input[@name=\"age\"][2]")).isSelected();
		System.out.println(age);
		if (!age) {
			driver.findElement(By.xpath("//input[@name=\"age\"][2]")).click();
		}

	}
}
