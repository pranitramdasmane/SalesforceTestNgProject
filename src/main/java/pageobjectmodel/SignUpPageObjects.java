package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	
    private	By firstname=By.xpath("//input[@name='UserFirstName']");

    private By lastname=By.xpath("//input[@name='UserLastName']");
  
    private	By email =By.xpath("//input[@name='UserEmail']");
	
    private By companyname=By.xpath("//input[@name='CompanyName']");
  
    private By phonenumber=By.xpath("//input[@name='UserPhone']");
   
    private	By employee=By.xpath("//select[@name='CompanyEmployees']");
	
    private	By country=By.xpath("//select[@name='CompanyCountry']");
	
    private By jobtitle=By.xpath("//select[@name='UserTitle']");
	
    private	By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpPageObjects(WebDriver driver2) {

		this.driver=driver2;
	}
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}
	public WebElement clickonemail() {
		return driver.findElement(email);
	}
	public WebElement yourcompany() {
		return driver.findElement(companyname);
	}
	public WebElement yournumber() {
		return driver.findElement(phonenumber);
	}
	public WebElement companyemployee() {
		return driver.findElement(employee);
	}
	
	public WebElement selectcountry() {
		return driver.findElement(country);
	}
	public WebElement selectjobtitle() {
		return driver.findElement(jobtitle);
	}
	public WebElement checkchecbox() {
		return driver.findElement(checkbox);
	}

}
