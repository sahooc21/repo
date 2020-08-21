package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nvbbb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//*[@id=\"Offers_Listing\"]/div[1]/div/ul/li[4]/span/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"moreOpt\"]/p[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"Offers_Listing\"]/div[2]/div/div/div/div[2]/div/div/div/div/div[2]")).click();
		
	

	}

}
