package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']/following::input[@name='firstName']")).sendKeys("lokesh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();		
		String expectedTitle = "View Lead | opentaps CRM";
		String actualTitle= driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title Matched!");
		}
		else
			System.out.println("Title not matched!");
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement updateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompanyName.clear();
		updateCompanyName.sendKeys("New Company");
		driver.findElement(By.xpath("//input[@value='Update']")).click();		
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		driver.close();
	}

}
