package stepDefinitiions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseUtil;
import pages.LoginPage;

public class LoginTest extends BaseUtil{
	private BaseUtil base;
	public LoginTest(BaseUtil base) {
		this.base=base;
	}
	
	@When("user opens URL")
	public void user_opens_url() throws Exception{
		base.driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
	}

	@Given("user enters username")
	public void user_enters_username() {
		LoginPage test = new LoginPage(base);
		test.enterUsername("standard_user");
	}

	@Given("user enters password")
	public void user_enters_password() {
		LoginPage test = new LoginPage(base);
		test.enterPassword("secret_sauce");
	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		LoginPage test = new LoginPage(base);
		test.clickToLogin();
	}


}
