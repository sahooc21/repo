package chinmaya;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tricjyiteratorre {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]")).click();
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("india");
		WebElement e=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(e);
		s.selectByValue("option3");
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("name")).sendKeys("chinu");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("displayed-text")).sendKeys("rahullala");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")));
		WebElement z=driver.findElement(By.id("mousehover"));
		Actions a=new Actions(driver);
		a.moveToElement(z).build().perform();
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
		String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
       Thread.sleep(5000);
			}
		Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
