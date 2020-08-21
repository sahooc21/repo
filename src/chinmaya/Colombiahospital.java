package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Colombiahospital {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.columbiaasia.com/");
		Actions pop = new Actions(driver);
		Thread.sleep(3000);
		pop.moveToElement(driver.findElement(By.id("cah-country"))).click().build().perform();
		
		//WebElement e = driver.findElement(By.id("cah-country"));
		//Select s = new Select(e);
		//s.deselectByValue("India");
		driver.findElement(By.id("cah-country")).sendKeys("india");
		
		pop.moveToElement(driver.findElement(By.id("cah-hospital"))).click().build().perform();
		driver.findElement(By.id("cah-hospital")).sendKeys("kolkata");
		
		
	}

}
