package salesForce1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SortOppurtunity {
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

       driver.findElement(By.xpath("//a[@class='toggle slds-th__action slds-text-link--reset ']")).click();
 
 }
}
