package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//SwitchTo frame 
		 driver.switchTo().frame(0);
		 
		//use ActionsClass to move the element 4 to 6
		
		Actions action = new Actions(driver);//Action class
		
		
		Thread.sleep(3000);
		
		WebElement item4 = driver.findElement(By.xpath("//ul[@id='sortable']/li[4]/span[1]"));
		WebElement item6 = driver.findElement(By.xpath("//ul[@id='sortable']/li[6]/span[1]"));
		action.dragAndDrop(item6, item4).perform();

	}

}
