package testcases;

import org.testng.annotations.Test;

import Base.BaseHooks;
import pages.Login;

public class VerifyHomePage extends BaseHooks {
	@Test
public void runVerifyHomePage  () throws InterruptedException {
	//Login lp=new Login();
	new Login(driver).enterUserName()
	.enterPassword()
	.clickLogin()
	.crmsfaClick()
	.verifyCreateLead();
	
}
}
