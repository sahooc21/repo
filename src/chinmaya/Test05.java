package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/index.html?e=2");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
       WebElement e= driver.findElement(By.name("username"));
       Actions a =new Actions(driver);
       a.click(e).sendKeys("sahooc21").build().perform();
       WebElement f =  driver.findElement(By.name("password"));
       a.click(f).sendKeys("chinmaya1234").build().perform();
      WebElement q= driver.findElement(By.xpath("//input[@type='submit']"));vg
      a.click(q).build().perform();
       
       
        
        
	}

}
