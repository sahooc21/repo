package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://login.salesforce.com/?locale=in");
	//	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("ajjdjfjff");
	//	driver.findElement(By.id("password")).sendKeys("1233444");
	//	driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	//	System.out.println(driver.findElement(By.id("error")).getText());
		driver.get("https://www.google.com/");
	//	driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("yahoo");
	  driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input\"")).click();
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input")).click();
		
		driver.findElement(By.xpath("//div[@class='gb_h gb_i']/a[text()='Images']")).click();
		
	}

}
