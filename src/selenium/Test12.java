package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "\"E:\\chromedriver\\chromedriver_win32\\chromedriver.exe\"");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
     String gty= driver.getTitle();
     System.out.println(gty);

	}

}
