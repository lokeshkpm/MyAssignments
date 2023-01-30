package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundCheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Others']")).click();
		WebElement TriStateElement = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		TriStateElement.click();
		Thread.sleep(1000);
		TriStateElement.click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		System.out.println(driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul[@data-label='Cities']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Berlin']/preceding-sibling::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'circle-close')]")).click();		
	
	}
	}

