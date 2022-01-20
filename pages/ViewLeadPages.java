package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseHooks;

public class ViewLeadPages extends BaseHooks {
public ViewLeadPages(ChromeDriver driver) {
	this.driver=driver;
	}
public ViewLeadPages verifyfirstname() {
	//driver.findElement(By.id("viewLead_firstName_sp")).click();
	boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
	Assert.assertTrue(displayed);
	return this;
}
}
