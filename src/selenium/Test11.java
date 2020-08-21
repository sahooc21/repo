package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		//String text=driver.findElement(By.name("websubmit")).getText();
		//System.out.println(text);
		
		//String months=driver.findElement(By.id("month")).getText();
		//System.out.println(months);
		
		
		//String attr=driver.findElement(By.name("email")).getAttribute("class");
		//System.out.println(attr);
		
		
		//attribute: link of element
		String linkText=driver.findElement(By.xpath("//a[contains(@title , 'Facebook home')]")).getAttribute("href");
		System.out.println(linkText);
		
		
		//css value of element
		String css=driver.findElement(By.name("email")).getCssValue("color");
		System.out.println(css);
		
		

	}

}
