package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Test08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome.0.69i59j0l2j35i39j0l2.3766j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.className("LC20lb")).click();
		

	}

}
