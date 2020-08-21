package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.crmpro.com/index.html");
    driver.findElement(By.name("username")).sendKeys("sahooc21");
    driver.findElement(By.name("password")).sendKeys("chinmaya1234");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
  
   
  driver.switchTo().frame("mainpanel");
  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    
    
    
    
    
    
	}

}
