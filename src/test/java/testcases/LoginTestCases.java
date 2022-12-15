package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Parameters;
import pageobjectmodel.LoginPageObject;

public class LoginTestCases extends BaseClass{
	
	@Test
	public void login() throws IOException {
		
		LoginPageObject LOP= new LoginPageObject(driver);
		
	LOP.enterusername().sendKeys(Parameters.username);
	
	LOP.enterpassword().sendKeys(Parameters.password);
		
	LOP.clickonlogin().click();
	
	CommonMethods.handelassertion(LOP.actualerror().getText(), Parameters.errormassage);
	

	
	}
}
