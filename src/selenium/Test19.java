package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.cricbuzz.com/");
   String ser= driver.findElement(By.className("cb-nav-tab")).getText();
   System.out.println(ser);
		
		
	}

}
