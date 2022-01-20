package pages;

import org.openqa.selenium.By;
//import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHooks;

public class Home extends BaseHooks {
public Home (ChromeDriver driver) {
	this.driver=driver;
	}
/*public void verifyCrsfaDisplay() {
		boolean displayed =  driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	}*/
public  MyHome crmsfaClick() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new MyHome(driver);
}
}
