package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.findElement(By.name("emailOrPhone")).sendKeys("8908659661");
		driver.findElement(By.name("fullName")).sendKeys("chinmaya ranjan");
		driver.findElement(By.name("username")).sendKeys("sahooc21");
		driver.findElement(By.name("password")).sendKeys("chinmaya12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
       
		
		
	
		
		
	}

}
