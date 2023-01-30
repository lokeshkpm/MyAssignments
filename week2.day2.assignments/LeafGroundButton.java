package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		
	/*	1. Click and Confirm title
		2. Confirm if the button is disabled
		3. Find the position of the Submit button
	*/	
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dashboard";
		System.out.println(actualTitle);
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Title Matched!");
		}
		else
			System.out.println("Title not matched!");
		driver.navigate().back();
	
		boolean enabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::button[@disabled='disabled']")).isEnabled();
		System.out.println(enabled);		
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button")).getLocation());
		
	}

}
