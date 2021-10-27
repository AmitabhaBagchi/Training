package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceWebTable {
	@Test
	public void webtable() throws InterruptedException, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/sorttable.html");
		
		String beforexpath = "//*[@id=\"table_id\"]/tbody/tr[";
		String afterxpath = "]/td[2]";
		List<String> obj1 = new ArrayList<String>();
		for (int i = 1; i <= 6; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			String txt=element.getText();
			obj1.add(txt);
			//System.out.println(element.getText());
		}
		System.out.println(obj1);
		
		//String obj=Arrays.toString(obj1);
		//List<String> obj3 =Arrays.sort(obj1);
		//Collections.sort(obj1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/thead/tr/th[2]")).click();
		Thread.sleep(1000);
		String before = "//*[@id=\"table_id\"]/tbody/tr[";
		String after = "]/td[2]";
		List<String> obj2 = new ArrayList<String>();
		for (int j = 1; j <= 6; j++) {
			String actual = before + j + after;
			WebElement element2 = driver.findElement(By.xpath(actual));
			obj2.add(element2.getText());
			//System.out.println(element2.getText());
		}
System.out.println(obj2);

System.out.println(obj1.equals(obj2)); 
	}
}
