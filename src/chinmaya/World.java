package chinmaya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class World {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/"); 
		List<WebElement> table=driver.findElements(By.cssSelector("tr td :nth-child(1)"));
		System.out.println(table.size());
		for(int i=0;i<10;i++) {
			String name[]=table.get(i).getText().split("  ");
			String fn=name[0];
			System.out.println(fn);
		}
		
		
		


	}

}
