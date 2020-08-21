package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.crmpro.com/index.html");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sahooc21");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chinmaya1234");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		List<WebElement> l=driver.findElements(By.tagName("td"));
		
		int x=l.size();
		System.out.println(x);
		
		

	}

}
