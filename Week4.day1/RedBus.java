package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//Step:1-Launch the url (https://www.redbus.in/)
	    driver.get(" https://www.redbus.in/");
	       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step:2-Enter From -Madiwala Bangalore
       driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore",Keys.ENTER);
       
       //Step:3-Enter To Koyambedu Chennai
       driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai",Keys.ENTER);
       
       //Step:4-Select the Date 30-September-2022 
       
       //note :  ***************** now it is pointing to 28-oct-2022 ***************
       
       driver.findElement(By.id("onward_cal")).click();
       driver.findElement(By.xpath(" //td[@class='next']")).click();//for arrow click
    
       WebElement calander = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[7]/td[5]"));
       calander.click();
       String title=driver.getTitle();//get title 
       System.out.println(title); 

}


	}


