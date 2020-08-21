package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("asdfgghjkl");
		driver.findElement(By.name("lastname")).sendKeys("sahooo");
		driver.findElement(By.name("reg_email__")).sendKeys("sahooc21@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sahooc21@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vsgsfsgshssshshxbx");
		Thread.sleep(8000);
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).clear();
		Thread.sleep(3000);
	//	driver.findElement(By.name("reg_email_confirmation__")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).clear();
		
		
		
		
		
		
		
	}

}
