package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdownlist {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Actions action = new Actions(driver);
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div/div/nav/ul/li[10]/a/span[2]/span[1]"));
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div/div/nav/ul/li[10]/div/a[3]")).click();
	
	
	
	
	
	
	}

}
