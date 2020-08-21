package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoout {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://newtours.demoaut.com/");
   // driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
    driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("chinmaya");
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("ranjan");
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8908659661");
    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("sahooc@gmail.com");
    driver.findElement(By.name("address1")).sendKeys("bangalore");
    driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("munikollala");
    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("karnataka");
    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("cuttack");
    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560037");
    
  Thread.sleep(7000);
     WebElement q= driver.findElement(By.xpath("//select[@name='country']"));
     Select s=new Select(q);
     s.selectByValue("254");
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sahooc21@123");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("chinmaya12345");
     driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("chinmaya12345");
     driver.findElement(By.xpath("//input[@name='register']")).click();
    
    
    
   

	}

}
