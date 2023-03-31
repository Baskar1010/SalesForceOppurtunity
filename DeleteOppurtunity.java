package salesForce1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DeleteOppurtunity {
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
	   
       WebElement delete = driver.findElement(By.xpath("//span[text()='Show Actions']/parent::span"));
       
       Actions actions = new Actions(driver);
       
       actions.moveToElement(delete).perform();
       
       delete.click();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("(//li[@class='uiMenuItem'])[2]")).click();
             
       driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']")).click();

 }
}
