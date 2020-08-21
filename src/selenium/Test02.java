package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.name("email")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("chinmaya1234");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(5000);
        driver.close();
       
	}

}
