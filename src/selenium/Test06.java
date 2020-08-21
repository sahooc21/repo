package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test06 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2"
			+ "FManageAccount&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.findElement(By.name("firstName")).sendKeys("adam");
	driver.findElement(By.name("lastName")).sendKeys("jack");
	driver.findElement(By.name("Username")).sendKeys("adam.jack2000");
	driver.findElement(By.name("Passwd")).sendKeys("adam$20987");
	driver.findElement(By.name("ConfirmPasswd")).sendKeys("adam$20987");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	
	
	

	}

}
