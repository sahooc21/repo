package chinmaya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyd1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.com/search?q=cardekho&oq=cardekho&aqs=chrome..69i57j0l5.10916j0j4&sourceid=chrome&ie=UTF-8");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		        String s1=driver.getTitle();  //get the title
				System.out.println(s1);
				
				String s2=driver.getCurrentUrl();// get the url of web page
				System.out.println(s2);
				
				String s3=driver.getPageSource(); // get the source code of webpage
			    System.out.println(s3);
			    
			    
                String   s4=driver.getWindowHandle();
                System.out.println(s4);
			    
				
				

	}

}
