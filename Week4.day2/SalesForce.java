package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the username as " ramkumar.ramaiah@testleaf.com "
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		//Enter the password as " Password#123 "
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		//click on the login button
		driver.findElement(By.id("Login")).click();
		
		//click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		
		//Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println(size);
		List<String> last=new ArrayList<String>(windowHandles);
        driver.switchTo().window(last.get(0)).getTitle();
        Thread.sleep(3000);
        
        //click on the confirm button in the redirecting page
        driver.switchTo().window(last.get(1)).getTitle();
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        
        //Get the title
        String title = driver.getTitle();
		System.out.println(title);
		
		//Get back to the parent window
		driver.switchTo().window(last.get(0)).getTitle();
		
		//close the browser
		driver.quit();
	}

}
