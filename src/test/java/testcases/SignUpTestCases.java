package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageobjectmodel.LoginPageObject;
import pageobjectmodel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Parameters;

public class SignUpTestCases extends BaseClass {
	
	@Test
	public void verifysignup() throws IOException, InterruptedException {
		
		LoginPageObject LOP= new LoginPageObject(driver);
		
		LOP.clickontryforfree().click();
		
		SignUpPageObjects SOP=new SignUpPageObjects(driver);
		
		Thread.sleep(2000);
		
		SOP.enterfirstname().sendKeys(Parameters.firstname);
		
		SOP.enterlastname().sendKeys(Parameters.lastname);
		
		SOP.clickonemail().sendKeys(Parameters.email);
		
		SOP.yourcompany().sendKeys(Parameters.company);
		
		SOP.yournumber().sendKeys(Parameters.phonenumber);
		
		SOP.checkchecbox().click();
		
		CommonMethods.SelectDropdown(SOP.companyemployee(),3);
		
		CommonMethods.SelectDropdown(SOP.selectcountry(),6);
		
		CommonMethods.SelectDropdown(SOP.selectjobtitle(),2);
		
		
	}
	

}
