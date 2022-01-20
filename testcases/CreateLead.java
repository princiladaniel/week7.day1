package testcases;

import org.testng.annotations.Test;

import Base.BaseHooks;
//import pages.Home;
import pages.Login;

public class CreateLead extends BaseHooks{
	@Test
public void runCreateLead() throws InterruptedException{
Login lp=new Login(driver);
lp.enterUserName()
.enterPassword()
.clickLogin()
.crmsfaClick()
.clickLead()
.clickCreateLead()
.companyName()
//.parentPartyId()
.firstName()
.lastName()
//.primaryPhoneNumber()
.clickButton()
.verifyfirstname();
}
}