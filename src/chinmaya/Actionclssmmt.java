package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclssmmt {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	Thread.sleep(3000);
	Actions action = new Actions(driver);
	WebElement e=driver.findElement(By.xpath("//span[text()='Electronics']"));
	Thread.sleep(3000);
	action.moveToElement(e).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Realme']")).click();
	
	
	
	
	
	
	

	}

}
