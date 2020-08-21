package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com");
   driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and@name='firstname']")).sendKeys("chinmayaranjabn");
   driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("sahooooooo");
   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sahooc291993@gmail.com");
   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("chinmaya1234567889");
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and@name='firstname']")).clear();
   
   driver.findElement(By.xpath("//input[@id='u_0_l']")).clear();
   driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
   
   
   
   

	}

}
