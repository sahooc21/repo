package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String sad=driver.findElement(By.name("lastname")).getAttribute("class");
		System.out.println(sad);
		
		
		
		
		

	}

}
