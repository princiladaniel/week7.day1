package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHooks;

public class CreateLeadPage extends BaseHooks {
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage companyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}
	/*public CreateLeadPage parentPartyId() {
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("organization");	
		return this;
	}*/
	public CreateLeadPage firstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("princilaroseline");
		return this;
	}
	public CreateLeadPage lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rose");	
		return this;
	}	 
	/*public CreateLeadPage primaryPhoneNumber() {
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8056378337");	
		 return this;
	}*/	 
	public ViewLeadPages clickButton() {
		 driver.findElement(By.name("submitButton")).click();
		 return new ViewLeadPages(driver);
	}	 
		
		
	}

