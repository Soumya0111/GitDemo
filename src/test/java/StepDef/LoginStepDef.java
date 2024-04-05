package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	LoginPage login;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   System.out.println("im inside POM");
	   
			   
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username , String password) {
		
		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password); 
				
		
//	    // Write code here that turns the phrase above into concrete actions
//	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username );
//	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.click();
	}

	@Then("user is navigated to Home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("User is on home page");
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.close();
	}



}
