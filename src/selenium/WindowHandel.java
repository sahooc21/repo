package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/ul[2]/li[1]/a")).click();
		  Set<String> abc=driver.getWindowHandles();
		   Iterator <String> it=abc .iterator();
		   while(it.hasNext()) {
			   driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
		   }
	}

}
