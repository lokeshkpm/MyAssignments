package assignments.week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		/*	1.Load the URL https://www.amazon.in/
			2.search as oneplus 9 pro 
			3.Get the price of the first product
			4. Print the number of customer ratings for the first displayed product
			5. Click the first text link of the first image
			6. Take a screen shot of the product displayed
			7. Click 'Add to Cart' button
			8. Get the cart subtotal and verify if it is correct.
			9.close the browser */
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of the first product: "+price);
		String customerRatings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Customer Ratings: "+customerRatings);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		Set<String> wHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/output.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		String subTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		if(price.contains(subTotal)) {
			System.out.println("Actual Price matches with subtotal!");
		}
		else
			System.out.println("Actual Price not matching with subtotal!");
		driver.close();


	}

}
