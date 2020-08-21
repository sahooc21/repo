package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demotest111 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	Actions a=new Actions (driver);
	WebElement e= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	a.moveToElement(e).build().perform();

	WebElement w=driver.findElement(By.xpath("//a[text()='Windows']"));
	a.click(w).build().perform();
	
	

	}

}
