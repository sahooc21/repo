package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Colombo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.columbiaasia.com/india/");
	
	
	Thread.sleep(8000);
	
	Actions a = new Actions(driver);
	WebElement q=driver.findElement(By.xpath("//div[@id='windowCloseButton']"));
	a.click(q).build().perform();
	
 WebElement
	
	
	

	
	
	
	
	
	
	
	
	
	
	WebElement e1=driver.findElement(By.xpath("//input[@id='container-search-widget_input1']"));
	Select s=new Select(e1);
	s.selectByValue("");
	
	
	
	
	
	
	
	

	}

}
