package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricky2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22777/nz-vs-ind-5th-t20i-india-tour-of-new-zealand-2020");
		WebElement table=driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1)"));

		int rowcount=table.findElements(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(3)")).size();
        int count=table.findElements(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(3) > div.cb-col.cb-col-8.text-right.text-bold")).size();
        
        for (int i=0;i<count;i++) {
        System.out.println(table.findElements(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(3) > div.cb-col.cb-col-8.text-right.text-bold")).get(i).getText());
        }
		

	}

}
