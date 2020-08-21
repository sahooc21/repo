package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hydclasspra1 {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver =new ChromeDriver();
   driver.get("https://www.google.com");
   driver.findElement(By.linkText("Gmail")).click();
   String ss=driver.getTitle();
   String exp="Gmail";
   if(ss.contains(exp)) {
	   System.out.println("tc1 passs");
   }
   else {
	   System.out.println("tc1 fail");
   }
   
driver.close();
	}

}
