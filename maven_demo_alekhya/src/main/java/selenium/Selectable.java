package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	@Test
	public void sel() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/selectable.html");

		boolean item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).isSelected();
		System.out.println("is selectable "+item1);
		if (!item1) {
			driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
			System.out.println("now item 1 is selected");
		}

		boolean item2=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).isSelected();
		System.out.println("is selectable "+item2);
		
		boolean item3=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).isSelected();
		System.out.println("is selectable "+item3);
		
		boolean item4=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).isSelected();
		System.out.println("is selectable "+item4);
		
		boolean item5=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).isSelected();
		System.out.println("is selectable "+item5);
		
		boolean item6=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).isSelected();
		System.out.println("is selectable "+item6);
		
		boolean item7=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).isSelected();
		System.out.println("is selectable "+item7);
		
		Thread.sleep(500);
		driver.close();
	
	}
}
