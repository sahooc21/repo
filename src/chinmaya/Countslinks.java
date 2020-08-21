package chinmaya;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countslinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	System.out.println(driver.findElements(By.tagName("a")).size());
	for(int i=0;i<driver.findElements(By.tagName("a")).size();i++) {
		System.out.println(driver.findElements(By.tagName("a")).size());
	}
	
	
	
	}

}
