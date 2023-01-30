package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FaceBook {

	public static void main(String[] args) {
		// Assignment:1 FaceBook
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enter the password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		 //( A normal click will do for this step) 
		
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lokesh");
		driver.findElement(By.name("lastname")).sendKeys("M");
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input[@type='text']")).sendKeys("9899998999");
	
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Test@12345");
		
		WebElement dateelement = driver.findElement(By.xpath("//select[@title='Day']"));
		Select date = new Select(dateelement);
		date.selectByValue("12");
		
		WebElement monthelement = driver.findElement(By.xpath("//select[@title='Month']"));
		Select mon = new Select(monthelement);
		mon.selectByValue("5");
		
		WebElement yearelement = driver.findElement(By.xpath("//select[@title='Year']"));
		Select year = new Select(yearelement);
		year.selectByValue("1989");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}

}
