package com.qa.cuke.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeaTest {
	
	private static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luke Edwards\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\com.qa.SeleniumFirst\\src\\main\\resources\\chromedriver.exe");
//      driver = new ChromeDriver(chromeCfg());     //add this line instead of the one below if using google to stop its popups, otherwise use normal as this can block needed popups
      driver = new ChromeDriver();
      driver.manage().window().setSize(new Dimension(1366, 1168));
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://www.practiceselenium.com/welcome.html");
	    System.out.println("correct web address");
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Menu = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
        Menu.click();
        System.out.println("menu");
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browse");
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Menu = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));		//added these two lines as this when/then set does not continue on from the 
        Menu.click();																												//previous when/then (copied from then previous @when)
		WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span"));
        Checkout.click();
        System.out.println("checkout buttons");
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("checkoutpage");
	}
	
	 @After
	    public void tearDown() {
	        driver.close();
	    }

}
