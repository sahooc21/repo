package selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test501 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
       
      WebDriver driver=new ChromeDriver();
   // driver.manage().window().maximize();
  //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    driver.get("https://www.flipkart.com/");
  //  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
//    WebElement e=driver.findElement(By.xpath("//span[text()='Men']"));
 //   Actions a=new Actions(driver);
 //   a.moveToElement(e).build().perform();
   driver.get("https://www.makemytrip.com");
  // WebElement sdf=driver.findElement(By.xpath("//span[@class='darkGreyText']"));
  // Actions we=new Actions(driver);
   //we.moveToElement(sdf).build().perform();
   List<WebElement> linklist = driver.findElements(By.tagName("button"));
                                   
	}

}
