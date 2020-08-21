package selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("real me u1");
		driver.findElement(By.xpath("//input[@type='submit' and@value='Go']")).click();
		driver.findElement(By.xpath("//img[@data-image-index='0']")).click();
		driver.findElement(By.xpath("//span[text()='4+64GB']")).click();
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		ArrayList<String> a1=new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(a1.get(1));
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();	
		Thread.sleep(5000);
		//driver.quit();
		//driver.close();
		driver.switchTo().window(a1.get(0));
		driver.close();
	
		
	}

}
