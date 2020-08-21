package chinmaya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demoooootest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions a=new Actions(driver);
		WebElement e= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		a.click(e).sendKeys("chinmaya").build().perform();
		
		WebElement w =driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		a.click(w).sendKeys("sahooo").build().perform();
		
		WebElement q= driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		a.click(q).sendKeys("marathalli ,,, bangalore").build().perform();
		
		WebElement r=driver.findElement(By.xpath("//input[@type='email']"));
		a.click(r).sendKeys("sahooc21@gmail.com").build().perform();
		
		WebElement t=driver.findElement(By.xpath("//input[@type='tel']"));
		a.click(t).sendKeys("8908659661").build().perform();
		
		WebElement y=driver.findElement(By.xpath("//input[@value='Male']"));
		a.click(y).build().perform();
		
		WebElement u=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		a.click(u).build().perform();
		
	WebElement i= driver.findElement(By.xpath("//div[@id='msdd']"));
      a.click(i).sendKeys("english").build().perform();
       
       
     //  WebElement ww = driver.findElement(By.xpath("//select[@id='Skills']"));
	
		WebElement e1=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Select se=new Select(e1);
		se.selectByValue("India");
		
		WebElement e2=driver.findElement(By.xpath("//span[@role='combobox']"));
		a.click(e2).build().perform();
		
		WebElement u1=driver.findElement(By.xpath("//span[text()='India']"));
		a.click(u1).sendKeys("india").build().perform();
		
		
		 
	
		
		
 
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
