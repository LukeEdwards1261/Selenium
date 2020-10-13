package com.qa.cuke.stepdefs;


import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTest {
	
	private static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luke Edwards\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\com.qa.SeleniumFirst\\src\\main\\resources\\chromedriver.exe");
//      driver = new ChromeDriver(chromeCfg());     //add this line instead of the one below if using google to stop its popups, otherwise use normal as this can block needed popups
      driver = new ChromeDriver();
      driver.manage().window().setSize(new Dimension(1366, 1168));
	}
	
	@Given("^we can open google$")
	public void we_can_open_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("https://www.google.com/");
	    System.out.println("open google");
	}

	@When("^we search for \"([^\"]*)\"$")
	public void we_search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("searching");
	}

	@Then("^google will return us an image of \"([^\"]*)\"$")
	public void google_will_return_us_an_image_of(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("return image");
	}

	@Given("^that i use the following credentials$")
	public void that_i_use_the_following_credentials(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (StriList<E>Integer, Date, enum etc)
		
		List<List<String>> listDataTable = arg1.raw();
		
	    List<String> userpass = listDataTable.get(1);
	    
	    System.out.println("Username: " + userpass.get(0) + ", Password: " + userpass.get(1));
	    System.out.println("Email: " + userpass.get(2) + ", Security: " + userpass.get(3));
	
		System.out.println("Credentials");
	}

	@When("^I interact with the webpage$")
	public void i_interact_with_the_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("interact with webpages");
	}

	@Then("^I should be able to proceed$")
	public void i_should_be_able_to_proceed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("proceed");
	}
	
    @After
    public void tearDown() {
        driver.close();
    }


}
