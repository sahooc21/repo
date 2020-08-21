package chinmaya;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldClock1212 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.timeanddate.com/worldclock/"); 
	List<WebElement> table =	driver.findElements(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody"));
		List<WebElement> nrows = driver.findElements(By.tagName("tr"));
	 for(int i=0;i<nrows.size();i++) {
		 List<WebElement>ncol=nrows.get(i).findElements(By.tagName("td"));
		 for(int n=0;n<ncol.size();n++) {
			 System.out.println(ncol.get(n).getText());
		 }
	 }

	}

}
