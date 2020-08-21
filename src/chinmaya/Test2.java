package chinmaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("file:///C:/Users/chinmaya/Desktop/fileupload.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='15']")).click();
		//Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\chinmaya\\Desktop\\autoit\\fileupload.exe");

	}

}
