package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHooks;

public class Login extends BaseHooks {
public Login(ChromeDriver driver) {
	this.driver=driver;
	}
public Login enterUserName() throws InterruptedException {
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");	
Thread.sleep(10000);
return this;
}
public Login enterPassword() {
	 driver.findElement(By.id("password")).sendKeys("crmsfa");	
	 return this;
}
public Home clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new Home(driver);
}
}
