package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hydfacebooktest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("chuiinjhjjh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("saghoo");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sahhooc21@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sahhooc21@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__'])")).sendKeys("chinmaya565656");
		WebElement s1=driver.findElement(By.id("day"));
		Select s=new Select(s1);
		s.selectByValue("7");
		driver.findElement(By.id("month"));
		s.selectByValue("4");
		driver.findElement(By.id("year"));
		s.selectByValue("2000");
		driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.id("u_0_14")).click(); 
		
		
		}
	   }
