package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("REGISTER")).click();
		 driver.findElement(By.name("firstName")).sendKeys("chinmaya");
		 driver.findElement(By.name("lastName")).sendKeys("sahoo");
		 driver.findElement(By.name("phone")).sendKeys("7978819487");
		 driver.findElement(By.name("userName")).sendKeys("sahooc21@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("at-marathali,munikollal");
		 driver.findElement(By.name("address2")).sendKeys("bangalore");
		 driver.findElement(By.name("city")).sendKeys("bangalore");
		 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("karnatak");
		 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("754130");
		 WebElement e = driver.findElement(By.xpath("//select[@name='country']"));
		 Select s=new Select(e);
		 s.selectByValue("92");
		 driver.findElement(By.id("email")).sendKeys("sahooc21");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cgggghuyq213");
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("cgggghuyq213");
		 
		 
		 
		   
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
		 
	}
}