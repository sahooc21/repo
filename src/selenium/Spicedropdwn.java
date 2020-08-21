package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicedropdwn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://book.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]")).click();*/
		

		

			 

			driver.get("http://spicejet.com"); 

			//  //a[@value='MAA']  - Xpath for chennai

			//  //a[@value='BLR']

			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

			driver.findElement(By.xpath("//a[@value='BLR']")).click();

			Thread.sleep(2000);

			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		

	}

}
