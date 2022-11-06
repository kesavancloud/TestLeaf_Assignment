package week2.day1;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateContact {
	
//	Assignment 3:Create Contact
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kesavan");
		driver.findElement(By.id("lastNameField")).sendKeys("K");
		
		String firstName=driver.findElement(By.id("firstNameField")).getAttribute("value");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(firstName);
        System.out.println(driver.getTitle());
        driver.close();
		
	}

}
