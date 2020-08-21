package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath110 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("7978819487");
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("papun");
		driver.findElement(By.name("username")).sendKeys("papun9119");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7978819484");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
