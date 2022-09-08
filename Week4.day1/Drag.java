package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//Launch the url: https://www.leafground.com/drag.xhtml
	    driver.get("https://www.leafground.com/drag.xhtml");
	       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
		Actions act=new Actions(driver);//Action Class
		 
	     WebElement colName = driver.findElement(By.xpath("//span[@class='ui-column-title']"));
	     WebElement colQuantity = driver.findElement(By.id("form:j_idt94:j_idt99"));
	     act.dragAndDrop(colName, colQuantity).perform();
	     String coloumnMoved = driver.findElement(By.xpath("//span[text()='Columns reordered']")).getText();
		 System.out.println("Toaster message for Column : " + coloumnMoved);
	     
	     WebElement row3 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[4]/td[1]"));
	     WebElement row4 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[5]/td[1]"));
	     act.dragAndDrop(row4, row3).perform();
			
	     // -Get the Toaster message to confirm it  
	     String rowMoved = driver.findElement(By.xpath("//span[text()='Row moved']")).getText();
		 System.out.println("Toaster message for Row : " + rowMoved);
		
	   
	    // ********* Resize Image ****** 
         //-Resize the message and Verify it 
		 Thread.sleep(2000);
	     WebElement reSize= driver.findElement(By.xpath("//div[@class='ui-wrapper']/div"));
	     act.dragAndDropBy(reSize,50,25).perform();
	     String tosterResize = driver.findElement(By.xpath("//span[text()='Image resized']/following-sibling::p")).getText();
		 System.out.println("Toster message for image Resized : " + tosterResize);
	  
         
         //Range Slider-Give a range between 10 and 80 
		 
		 /*using drag and drop :
		 Thread.sleep(2000);
		 WebElement slider= driver.findElement(By.xpath("//div[contains(@class,'ui-slider ui-corner-all')]/span"));
	     act.dragAndDropBy(slider,80,0).perform();
	     
	     Thread.sleep(2000);
	     act.dragAndDropBy(slider,-160,0).perform();*/
	    
	    
		 //using move by off set :
		 WebElement slider= driver.findElement(By.xpath("//div[contains(@class,'ui-slider ui-corner-all')]/span"));
	     act.moveToElement(slider).clickAndHold()
	     .moveByOffset(80, 0)//(use movebyOffset() for x values ,y should be 0 
	     .pause(300)
	     .moveByOffset(-160,0)//	 and use negative value for right move)	 
	     .release().perform();
	}


	}


