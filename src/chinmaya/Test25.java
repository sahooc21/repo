package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/index.cfm?CFID=246133&CFTOKEN=56845358&jsessionid=8e30189a345693f96ee61e2b5f176d3f131d");
		//driver.get("https://www.crmpro.com/index.html?e=2");
        //driver.findElement(By.xpath("//input[@class='form-control'and@name='name']")).sendKeys("sahooc21");
       // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chinmaya1234");
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        

	}

}
