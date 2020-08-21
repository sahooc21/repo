package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ravenshawuniversity.ac.in/Home.php");
		String ret=driver.findElement(By.className("full")).getCssValue("color");
		System.out.println(ret);
		

		
		
		
		

	}

}
