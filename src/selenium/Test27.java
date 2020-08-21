package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com/");
      driver.findElement(By.xpath("//input[@class='input-field-md input__field'and@id='mobileNo']")).sendKeys("7978819487");
      driver.findElement(By.xpath("//input[@class='input-field-md input__field'and@name='password']")).sendKeys("chinmaya1234");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//button[@onclick='return validLogin();']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@class='input-field'and@name='toMobile']")).sendKeys("8908659661");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//textarea[@class='free-sms-text custom-scrollbar']")).sendKeys("hellowwwww");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@id='sendButton']")).click();
      
      
      
      
      
      
      
	}

}
