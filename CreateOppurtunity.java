package salesForce1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateOppurtunity {
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

 	   driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
 	   
 	   driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Aaathimoothoo");
 	   
 	   WebElement date = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
 	   
 	   date.click();
 	   
 	   date.sendKeys("3/30/2023");
 	   
 	   WebElement stage = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
 	   
 	   stage.click();
 	  
 	   WebElement select = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[3]//span"));

	   select.click();
 	  
 	   driver.findElement(By.xpath("//button[text()='Save']")).click();
 	   
 	   
	}
}
