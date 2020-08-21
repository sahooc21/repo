package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		//title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		//url of the page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String src=driver.getPageSource();
		System.out.println(src);
		
	
		

	}

}
