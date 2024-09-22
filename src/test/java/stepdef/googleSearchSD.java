package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mystore.pageobjects.googleSearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchSD {
	
	
	googleSearchPage gs;
	
	@Given("User is on google url")
	public void user_is_on_google_url() throws InterruptedException {
		gs=new googleSearchPage();
		gs.getConfigData();
		//gs.accessAppUrl();
	}
	@When("^User Enter the searchKeyword in (.*)$")
	public void user_enter_the_search_keyword_in_text_box(String data) throws InterruptedException {
	
		gs=new googleSearchPage();
		gs.setInput(data);
	   
	}

	@When("User clicked on search button")
	public void user_clicked_on_search_button() throws Throwable {
		
		gs=new googleSearchPage();
		gs.clickonBtn();
	   
	}

	

}
