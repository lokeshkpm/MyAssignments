package assignments.week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement toolElements = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select ddTool = new Select(toolElements);
		List<WebElement> toolOptions = ddTool.getOptions();
		for (int i = 0; i<toolOptions.size(); i++) {
			Thread.sleep(2000);
			if (i==1) {
				toolOptions.get(i).click();
			}
		}
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Choose the Course']//following::button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//h5[contains(text(),'language chosen')]//following::label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();	
	}
}
