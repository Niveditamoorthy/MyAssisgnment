package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//Launch the url: https://www.leafground.com/menu.xhtml
	    driver.get("https://www.leafground.com/menu.xhtml");
	       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
		Actions act=new Actions(driver);//Action Class
		
       //******  Menu Bar *******
       // -Do click on shipment  
        WebElement shipments = driver.findElement(By.xpath("//span[text()='Shipments']"));
        shipments .click();
        act.moveToElement(shipments).perform();
        
        // mousehover on Tracker
        WebElement tracker = driver.findElement(By.xpath("(//span[text()='Tracker'])[1]"));
        act.moveToElement(tracker).perform();
        
        // Do rightClick on Tracker
        WebElement rightClick= driver.findElement(By.xpath("(//span[text()='Tracker'])[1]"));
        act.contextClick(rightClick).perform();
        Thread.sleep(2000);
        
        //****** Slide Menu ********
        //Do click Orders
        driver.findElement(By.xpath("(//span[text()='Orders'])[2]")).click();
        Thread.sleep(2000);
        // click Back 
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-w']")).click();
        Thread.sleep(2000);
	}


	}

