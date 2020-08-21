package chinmaya;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("\"C:\\Users\\chinmaya\\Desktop\\filecompose.exe");
		
		
		
		
		
		
		
		
	}

}
