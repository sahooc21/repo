package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Colombia11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.columbiaasia.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul/li[1]/a")).click();
		Actions popp = new Actions(driver);
		Thread.sleep(3000);
		popp.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div[2]/div[3]/nav/ul/li[2]/span[2]"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"windowCloseButton\"]")).click();

	}

}
