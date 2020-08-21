package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
//	driver.get("https://www.google.com/search?q=gmail&oq=gmail&aqs=chrome..69i57j69i61j69i60j0l3.2973j0j8&sourceid=chrome&ie=UTF-8");
//	String strr=driver.getTitle();
//	System.out.println(strr);
//	String zse=driver.getCurrentUrl();
//	System.out.println(zse);
//	String saw=driver.getPageSource();
//	System.out.println(saw);
//	String der=driver.findElement(By.name("reg_email__")).getAttribute("id");
//	System.out.println(der);
//	 String strr=driver.findElement(By.name("birthday_day")).getText();
//	 System.out.println(strr);
	String css=driver.findElement(By.name("websubmit")).getCssValue("color");
	System.out.println(css);

	
	
	
	
	
	
	
	
	
	
	
	}

}
