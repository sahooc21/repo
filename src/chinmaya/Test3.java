package chinmaya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		//system property
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		//initialize webdriver
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
