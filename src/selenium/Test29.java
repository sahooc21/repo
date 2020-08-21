package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test29 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement e=driver.findElement(By.id("month"));
		//WebElement e=driver.findElement(By.id("year")); 
		//WebElement e=driver.findElement(By.id("day"));
		Select s=new Select(e);
		//s.selectByVisibleText("Oct");
		//s.selectByIndex(8);
		//s.selectByValue("3");
		
		int x=s.getOptions().size();
		System.out.println(x);
		
		List<WebElement>l=s.getOptions();
		for(int i=1; i<x; i++ )
		{
			String g=l.get(i).getText();
			System.out.println(g);
			if(g.equals("Feb"))
				l.get(i).click();
			
		}
	}

}
