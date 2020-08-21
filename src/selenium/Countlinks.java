package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlinks {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    System.out.println(driver.findElements(By.tagName("a")).size()); 
    
   WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
   System.out.println( Footerdriver.findElements(By.tagName("a")).size());
   
   WebElement columndriver =driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
   System.out.println(columndriver.findElements(By.tagName("a")).size());
   
   
   
   
    
    
    
    
    
	}                                  
}
