package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("firstname")).sendKeys("lipun");
    driver.findElement(By.name("lastname")).sendKeys("patra");
	driver.findElement(By.name("reg_email__")).sendKeys("chinmaya_2013@yahoo.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("chinmaya_2013@yahoo.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("papun1234567");
	driver.findElement(By.name("birthday_day")).sendKeys("12");
	driver.findElement(By.name("birthday_month")).sendKeys("july");
	driver.findElement(By.name("birthday_year")).sendKeys("2000");
	
	//driver.findElement(By.id("u_0_a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"u_0_11\"]/span[2]")).click();
	
	//driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
	
	//driver.findElement(By.xpath("//label[text()='Custom']")).click();
	
	driver.findElement(By.name("websubmit")).click();
	//driver.findElement(By.xpath("//a[text()='Help']"));
	
	

	
	
	

	}

}
