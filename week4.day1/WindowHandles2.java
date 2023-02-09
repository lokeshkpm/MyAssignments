package assignments.week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class WindowHandles2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		System.out.println(driver.getTitle());
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		System.out.println(driver.getTitle());		

		
		driver.switchTo().window(parentHandle);
		System.out.println(driver.getTitle());
		
		driver.close();


	}

}
