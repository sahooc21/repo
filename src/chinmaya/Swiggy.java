package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver lipun=new ChromeDriver();
		lipun.manage().window().maximize();
		lipun.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lipun.get("https://www.swiggy.com/");
		lipun.findElement(By.xpath("//input[@id='location']")).sendKeys("munikollala");
		lipun.findElement(By.xpath("//span[text()='FIND FOOD']")).click();

	}

}
