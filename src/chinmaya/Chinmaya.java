package chinmaya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chinmaya {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.gmail.com/");
	 driver.close();
	}

}
