package assignments.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContactWindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * //Pseudo Code		  
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"		  
		 * 2. Enter UserName and Password Using Id Locator		  
		 * 3. Click on Login Button using Class Locator		  
		 * 4. Click on CRM/SFA Link		 
		 * 5. Click on contacts Button		  	
		 * 6. Click on Merge Contacts using Xpath Locator		  
		 * 7. Click on Widget of From Contact		  
		 * 8. Click on First Resulting Contact		  
		 * 9. Click on Widget of To Contact		  
		 * 10. Click on Second Resulting Contact		  
		 * 11. Click on Merge button using Xpath Locator		  
		 * 12. Accept the Alert		  
		 * 13. Verify the title of the page
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']//following::img")).click();
		Thread.sleep(3000);
		Set<String> wHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(newWindow.get(0));
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']//following::img")).click();
		Thread.sleep(3000);
		wHandles = driver.getWindowHandles();
		newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(newWindow.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String expectedTitle = "Merge Contacts";
		String actualtitle = driver.getTitle();
		if(actualtitle.contains(expectedTitle)) {
			System.out.println("Title matched! "+actualtitle);
		}
		

	}

}
