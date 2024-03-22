package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStarted_SD {
	

	static WebDriver driver;
	
	@Given("The user should be able to open the browser")
	public void the_user_should_be_able_to_open_the_browser() {
	
		driver = new ChromeDriver();

		
	}

	@When("The user enter the DS_Algo Portal <URL>")
	public void the_user_enter_the_ds_algo_portal_url() {
		
		String URL = "https://dsportalapp.herokuapp.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(URL);
	   
	}

	@Then("The user should landed on the DS_Algo Get Started page with message {string}")
	public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message(String string) {

	  
	}

	@Given("The user should open the DS Algo Portal URL in any supported browser")
	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
		
	
	   
	}
	
}
