package selenium;

//import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookxpath {

	//private static final String WindowHandels = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String str="https://www.facebook.com/";
		
		
		driver.get(str);
		
		
		//driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("zxncjdjdjdj");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sahoo");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sahooc21@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sahooc21@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("awsedrftgy");
		WebElement e=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select (e);
		s.selectByValue("15");
		WebElement d=driver.findElement(By.xpath("//select[@id='month']"));
		Select p= new Select(d);
		p.selectByValue("9");
		WebElement a= driver.findElement(By.id("year"));
		Select z = new Select(a);
		z.selectByValue("1999");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
