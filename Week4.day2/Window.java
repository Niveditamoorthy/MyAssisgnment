package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click Open Multiple 
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		//Get the size of available Windows
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println(size);
		
		//switch to last window 
		List<String> last=new ArrayList<String>(windowHandles);
        driver.switchTo().window(last.get(0)).getTitle();
        
        // Get the Title of the Window
        String title = driver.getTitle();
		System.out.println(title);
		
		//Close all the windows except last window
        driver.switchTo().window(last.get(1));
        driver.close();
        driver.switchTo().window(last.get(2));
		driver.close();
	}

}
