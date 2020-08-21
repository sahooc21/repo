package papunseleniumpractics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Autamotionpractics {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	WebElement e=driver.findElement(By.xpath("//a[text()='Women']"));
	Actions a=new Actions(driver);
	a.moveToElement(e).build().perform();
	driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
	WebElement f=driver.findElement(By.id("selectProductSort"));
	Select s=new Select (f);
	s.selectByValue("name:asc");
	

	                                    

	}

}
