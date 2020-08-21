package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phjasdf {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://s1.demo.opensourcecms.com/s/44");
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a/span")).click();
	driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
	driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
	driver.findElement(By.id("btnLogin")).click();	
	
	
	
	}

}
