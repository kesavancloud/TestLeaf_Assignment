package week2.day1;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicateLead {

//	Assignment 2:Duplicate Lead
//
//  1.  Launch URL "http://leaftaps.com/opentaps/control/login"
//	2.  Enter UserName and Password Using Id Locator
//	3.  Click on Login Button using Class Locator
//	4.  Click on CRM/SFA Link
//	5.  Click on Leads Button
//	6.  Click on Create Lead 
//	7.  Enter CompanyName Field Using id Locator
//	8.  Enter FirstName Field Using id Locator
//	9.  Enter LastName Field Using id Locator
//	10. Enter FirstName(Local) Field Using id Locator
//	11. Enter Department Field Using any Locator of Your Choice
//	12. Enter Description Field Using any Locator of your choice 
//	13. Enter your email in the E-mail address Field using the locator of your choice
//	14. Click on Create Button
//	15. Get the Title of Resulting Page using driver.getTitle()
//  16. Click on Duplicate button
//  17. Clear the CompanyName Field using .clear() And Enter new CompanyName
//  18. Clear the FirstName Field using .clear() And Enter new FirstName
//	19. Click on Create Lead Button
//  20. Get the Title of Resulting Page using driver.getTitle()
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kesavan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kutty");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I'm excited to learn about automation testing with the Selenium tool.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kesavancloud1984@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		if(title1.contains("View Lead"));
		System.out.println("The Page has launched");
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Duplicate Company");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kesavan K");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
