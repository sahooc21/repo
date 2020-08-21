package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mmtttt {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com");
	Actions a= new Actions(driver);
	WebElement e=driver.findElement(By.xpath("//span[@class='chNavText']"));
	a.moveToElement(e).build().perform();
	driver.findElement(By.xpath("(//a[text()='International Hotels'])[1]")).click();

	}

}
