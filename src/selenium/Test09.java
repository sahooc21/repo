package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test09 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=free+crm&oq=free&aqs=chrome.0.69i59j69i57j0l4.3493j0j8&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.className("sA5rQ")).click();
		driver.findElement(By.className("fcrmbanner_btn")).click();
		driver.findElement(By.name("firstname")).sendKeys("chinmaya");
		driver.findElement(By.name("email")).sendKeys("sahooc21@gmail.com");
		driver.findElement(By.name("password")).sendKeys("papun123456");
		driver.findElement(By.name("r_address/1.phone")).sendKeys("8908659661");
		driver.findElement(By.className("za-tos")).click();
		driver.findElement(By.id("signupbtn")).click();

	}

}
