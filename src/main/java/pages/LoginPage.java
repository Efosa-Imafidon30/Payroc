package pages;

import org.openqa.selenium.By;

public class LoginPage extends BaseUtil{
	private BaseUtil base;
	public LoginPage(BaseUtil base) {
		this.base=base;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginB = By.id("login-button");
	
	public void enterUsername(String pass) {
		base.driver.findElement(username).sendKeys(pass);
	}

	public void enterPassword(String pass) {
		base.driver.findElement(password).sendKeys(pass);
	}
	
	public void clickToLogin() {
		base.driver.findElement(loginB).click();
	}

}
