package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//List 
	//	List<WebElement> l=driver.findElements(By.xpath("//input[@name='sex']"));
	//	l.get(1).click();
		
		
		List<WebElement> l=driver.findElements(By.tagName("a"));
		int x=l.size();
		System.out.println(x);
		
		
		

	}

}
