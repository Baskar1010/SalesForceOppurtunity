package salesForce1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditOppurtunity {
   public static void main(String[] args) {
	
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
	   
	   driver.findElement(By.xpath("(//th[@class='slds-cell-edit cellContainer'])[1]")).click();
	   
	   driver.findElement(By.xpath("//button[@class='slds-button trigger slds-button_icon-border']")).click();

	   WebElement findElement = driver.findElement(By.xpath("//div[@class='slds-cell-wrap slds-popover__body']//input['slds-grow input']"));
	   
	   findElement.clear();
	   
	   findElement.sendKeys("aathimuthoo",Keys.ENTER);
	   
	   driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral test-saveButton uiButton--default uiButton--brand uiButton']")).click();
	   
	   
	   
	   
	   
	   
   }
}
