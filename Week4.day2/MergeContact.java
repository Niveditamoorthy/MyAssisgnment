package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //Click on Login Button using Class Locator
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //Click on CRM/SFA Link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //Click on contacts Button
        driver.findElement(By.linkText("Contacts")).click();
        
        //Click on Merge Contacts using Xpath Locator
        driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
        
        //Click on Widget of From Contact
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
        
        //Click on First Resulting Contact
        Set<String> fromContact = driver.getWindowHandles();
        List<String> first=new ArrayList<String>(fromContact);
        driver.switchTo().window(first.get(1)).getTitle();
        driver.findElement(By.linkText("DemoCustomer")).click();

        
        //Click on Widget of To Contact
        driver.switchTo().window(first.get(0)).getTitle();
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        
        
        //Click on Second Resulting Contact
        Set<String> toContact = driver.getWindowHandles();
        List<String> second =new ArrayList<String>(toContact);
        driver.switchTo().window(second.get(1)).getTitle();
        driver.findElement(By.linkText("FrenchCustomer")).click();
       
        
        //Click on Merge button using Xpath Locator
        driver.switchTo().window(second.get(0)).getTitle();
        driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
        Thread.sleep(3000);
        
        // Accept the Alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        
        // Verify the title of the page
        String title=driver.getTitle();
        System.out.println(title); 

	}

}
