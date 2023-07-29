package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("karthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kamal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("karthiga");
		driver.findElement(By.name("departmentName")).sendKeys("IT Dept");
		
		WebElement descriptionVal = driver.findElement(By.id("createLeadForm_description"));
		descriptionVal.sendKeys("Testing Purpose only");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthigakumar21@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		
		 driver.findElement(By.id("updateLeadForm_description")).sendKeys("Automation");
		driver.findElement(By.name("submitButton")).click();
		String title= driver.getTitle();
		System.out.println("the title is:" +title);
		if(title.contains(" opentaps CRM")) {
			System.out.println("the given title has same");
		}else {
			System.out.println("not same");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
