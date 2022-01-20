package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseHooks;

public class MyHome extends BaseHooks {
public MyHome(ChromeDriver driver) {
	this.driver=driver;
	}
	public void verifyCreateLead() {
		boolean displayed =  driver.findElement(By.linkText("Leads")).isDisplayed();
		Assert.assertTrue(displayed);
	}
public  MyLeads clickLead() {
	driver.findElement(By.linkText("Leads")).click();
	 return new MyLeads(driver);
}
}