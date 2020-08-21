package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hydrediffmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("chinu");
		driver.findElement(By.xpath("//input[contains(@name,'logind')]")).sendKeys("kunumun1234");
		driver.findElement(By.xpath("//input[contains(@name,'passwdd')]")).sendKeys("pass12334");
		driver.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("pass1234");
		driver.findElement(By.name("altemaildc51d641")).sendKeys("sahh@yahoo.com");
		driver.findElement(By.xpath("//input[contains(@onclick,'chk_')]")).click();
		driver.findElement(By.xpath("//input[contains(@onkeyup,'allow')]")).sendKeys("9090999999");
		WebElement e=driver.findElement(By.xpath("//select[contains(@name,'DOB_D')]"));
		Select s=new Select(e);
		s.selectByValue("03");
		WebElement e1=driver.findElement(By.xpath("//select[contains(@name,'DOB_M')]"));
		Select s1=new Select(e1);
		s1.selectByValue("08");
		WebElement e2=driver.findElement(By.xpath("//select[contains(@name,'DOB_Y')]"));
		Select s2=new Select(e2);
		s2.selectByValue("2000");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		WebElement e3=driver.findElement(By.xpath("//select[@id='country']"));
		Select s3=new Select(e3);
		s3.selectByValue("99");
		WebElement e4=driver.findElement(By.xpath("//select[contains(@name,'cityd')]"));
		Select s4=new Select(e4);
		s4.selectByValue("Chennai");
		driver.findElement(By.id("Register")).click();
			}
	      }
