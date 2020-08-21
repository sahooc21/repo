package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	//	driver.findElement(By.name("q")).sendKeys("apple");
	 //   driver.findElement(By.className("vh79eN")).click();
		
	//	driver.manage().deleteAllCookies();
		int y=driver.manage().getCookies().size();
		System.out.println(y);
		
		

	}

}
