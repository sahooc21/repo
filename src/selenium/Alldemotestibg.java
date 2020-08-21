package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alldemotestibg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
		//driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.get("http://demo.automationtesting.in/");
		driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a")).click();
		
		
		int cookies= driver.manage().getCookies().size();
		   System.out.println(cookies);
		
		
		
		driver.findElement(By.xpath("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("araman");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("dasgjhgh");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("bangalore, marathalli");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sahooc21111@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7377624351");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("selenium,java");
		WebElement e = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s= new Select (e);
		s.selectByValue("Android");
		WebElement a=driver.findElement(By.xpath("//select[@id='countries']"));
		Select x=new Select(a);
		s.selectByValue("India");
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("india");
		WebElement g=driver.findElement(By.id("yearbox"));
		Select v=new Select(g);
		s.selectByValue("1947");
		
		WebElement b=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select k=new Select(b);
		s.selectByValue("August");
		
		WebElement j=driver.findElement(By.id("daybox"));
	
		Select h=new Select(j);
		s.selectByValue("15");
		driver.findElement(By.id("firstpassword")).sendKeys("papun123");
		driver.findElement(By.id("secondpassword")).sendKeys("papun123");
		driver.findElement(By.id("submitbtn")).click();
		driver.manage().deleteAllCookies();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
