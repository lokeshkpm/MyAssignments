package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//h5[contains(text(),'favorite browser')]/following::label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'default select')]/following::label[text()='Safari']")).getText());
		driver.findElement(By.xpath("//label[text()='1-20 Years']/preceding-sibling::div")).click();

	}

}
