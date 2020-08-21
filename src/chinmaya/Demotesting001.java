package chinmaya;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotesting001 {

	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("rajeeb");
		Thread.sleep(5000);
		driver.findElement(By.id("imagesrc")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\chinmaya\\Desktop\\ ");
		//Runtime.getRuntime().exec(command: "C:\\Users\\chinmaya\\Desktop\\uploadfile.exe");

	}

}
