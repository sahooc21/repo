package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demotesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("chinmaya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sahoo");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("atpo-bangalore");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sahooc21@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8908659661");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox2")).click();
		
	
		//driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("english");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a")).click();
		WebElement ww = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s=new Select(ww);
		s.selectByValue("iPhone");
	WebElement e1=driver.findElement(By.id("countries"));
		Select se=new Select(e1);
		se.selectByValue("India");
		
	//	WebElement wqe=driver.findElement(By.xpath("//span[@role='combobox']"));
	//	Select sa11=new Select(wqe);
	//	sa11.
	
		
		
		
		WebElement q=driver.findElement(By.id("yearbox"));
		Select e=new Select(q);
		e.selectByValue("2004");
		WebElement e2=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select se1=new Select(e2);
		se1.selectByValue("November");
		WebElement we=driver.findElement(By.id("daybox"));
		Select sa=new Select(we);
		sa.selectByValue("4");
		driver.findElement(By.id("firstpassword")).sendKeys("papun123455");
		driver.findElement(By.id("secondpassword")).sendKeys("papun123455");
		driver.findElement(By.id("submitbtn"));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
