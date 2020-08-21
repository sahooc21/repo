package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colombiahs1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.columbiaasia.com/india/");
		driver.findElement(By.xpath("//a[@class='active']")).click();
		driver.findElement(By.xpath("dftllawj")).sendKeys("chinmaya");
		driver.manage().getCookieNamed("gmabhytsrt").getClass()
		
		
		
		
		
		

	}

}
