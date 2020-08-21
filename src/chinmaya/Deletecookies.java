package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletecookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://timesofindia.indiatimes.com/");
	   int  cook   =	driver.manage().getCookies().size();
	   System.out.println(cook);
	   
	   Thread.sleep(50000);
	   
	 driver.manage().deleteAllCookies();
	   
	   
	   int cook1=driver.manage().getCookies().size();
	   System.out.println(cook1);
	   
	   

	}

}
