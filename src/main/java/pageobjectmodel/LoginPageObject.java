package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;

	private By username = By.xpath("//input[@id='username']");

	private By password = By.xpath("//input[@id='password']");

	private By login = By.xpath("//input[@id='Login']");

	private By tryforfree = By.xpath("//a[@id='signup_link']");

	private By errormassage = By.xpath("//div[@id='error']");

	public LoginPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterusername() {

		return driver.findElement(username);
	}

	public WebElement enterpassword() {

		return driver.findElement(password);
	}

	public WebElement clickonlogin() {

		return driver.findElement(login);

	}

	public WebElement clickontryforfree() {

		return driver.findElement(tryforfree);
	}

	public WebElement actualerror() {

		return driver.findElement(errormassage);
	}

}