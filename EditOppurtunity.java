package salesForce1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditOppurtunity {
   public static void main(String[] args) throws InterruptedException {
	
	   ChromeOptions options = new ChromeOptions();
		
	   options.addArguments("start-maximized","--remote-allow-origins=*");
		
	   ChromeDriver driver = new ChromeDriver(options);
		 
	   driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		 
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
	   driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		 
	   driver.findElement(By.id("password")).sendKeys("Leaf@123");
	   
	   driver.findElement(By.id("Login")).click();
	   
	   driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 
	   driver.findElement(By.xpath("//button[text()='View All']")).click();
	   
	   driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Opportunities");
	   
	   driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
	   
	//   driver.findElement(By.xpath("(//th[@class='slds-cell-edit cellContainer'])[1]")).click();
	   
	  // driver.findElement(By.xpath("//button[@class='slds-button trigger slds-button_icon-border']")).click();

	  // WebElement findElement = driver.findElement(By.xpath("//div[@class='slds-cell-wrap slds-popover__body']//input['slds-grow input']"));
	   
	   //findElement.clear();
	   
	   //findElement.sendKeys("aathimuthu1",Keys.ENTER);
	   
       WebElement edit = driver.findElement(By.xpath("//span[text()='Show Actions']/parent::span"));
       
       Actions actions = new Actions(driver);
       
       actions.moveToElement(edit).perform();
       
       edit.click();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("(//li[@class='uiMenuItem'])[1]")).click();
       
       WebElement name = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
       
       name.clear();
       
       name.sendKeys("Baskar");
 	   
 	   WebElement date = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
 	   
 	   date.click();
 	   
 	   date.clear();
 	   
 	   date.sendKeys("3/20/2023");
       
	   driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	   
	   
	   
	   
	   
	   
   }
}
