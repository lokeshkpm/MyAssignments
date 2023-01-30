package assignments.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundTextBox {

	public static void main(String[] args) throws InterruptedException {
		
	/*	TextBox
		=======
		https://www.leafground.com/input.xhtml
		1. Type your name
		2. Append Country to this City
		3. Verify if text box is disabled
		4. Clear the typed text
		5. Retrieve the typed text
		6. Type email and Tab. Confirm control moved to next element
		7. Type about yourself
		8. Text Editor
		9. Just Press Enter and confirm error message*
		10. Click and Confirm Label Position Changes
		11. Type your name and choose the third option
		12. Click and Confirm Keyboard appears
		13. Custom Toolbar 
*/		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("j_idt88:name")).sendKeys("Lokesh");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" India");
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(enabled);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String text = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(text);
		WebElement elementEmail = driver.findElement(By.id("j_idt88:j_idt99"));
		elementEmail.sendKeys("test@test.com");
		elementEmail.sendKeys(Keys.TAB);
		System.out.println("Control moved to next element!");		
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Test1 \nTest2 \nTest3 \n");
		driver.findElement(By.xpath("//button[@class='ql-bold']")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Test Data");		
		
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);		
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText());		
		
		Point location1 = driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).getLocation();
		System.out.println(location1.getX());
		System.out.println(location1.getY());		
	
		WebElement element = driver.findElement(By.xpath("//span[@class='ui-float-label']/input"));
		driver.executeScript("arguments[0].click()", element);	
		Point location2 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		System.out.println(location2.getX());
		System.out.println(location2.getY());			
		
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Lokesh");
		List<WebElement> nameList = driver.findElements(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']"));
		nameList.get(2).click();
		
		driver.findElement(By.name("j_idt106:j_idt122")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]")).isDisplayed());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[text()='Custom Toolbar']/following::button[@class='ql-italic']")).click();
		driver.findElement(By.xpath("//h5[text()='Custom Toolbar']/following::div[@class='ql-editor ql-blank']")).sendKeys("Test Data");
		
				
	}

}

