package week2.day1;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
				
		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesManager");

		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
        //click login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kesavan");

		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kutty");
				
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Testing");
		
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I'm interested in learning about automation testing with the Selenium tool.");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kesavancloud1984@gmail.com");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
	    //Get the Title of Resulting Page.
		System.out.println(driver.getTitle());
		
		
		
	}

}
