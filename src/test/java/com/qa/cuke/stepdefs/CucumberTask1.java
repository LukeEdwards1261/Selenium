package com.qa.cuke.stepdefs;


import static org.junit.Assert.assertEquals;

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


public class CucumberTask1 {
	
	private static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luke Edwards\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\com.qa.SeleniumFirst\\src\\main\\resources\\chromedriver.exe");
//      driver = new ChromeDriver(chromeCfg());     //add this line instead of the one below if using google to stop its popups, otherwise use normal as this can block needed popups
      driver = new ChromeDriver();
      driver.manage().window().setSize(new Dimension(1366, 1168));
	}
	
	@Given("^we can login to the website$")
	public void we_can_login_to_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://thedemosite.co.uk/");
		System.out.println("access website");
		
	}

	@When("^we create a user using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void we_create_a_user_using_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		WebElement AddAUser = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
        AddAUser.click();
        Thread.sleep(3000);
        WebElement Username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
        Username.sendKeys(arg1);
        WebElement Password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
        Password.sendKeys(arg2);
        WebElement SaveUser = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
        SaveUser.click();

	    
	    
	    System.out.println("create user");
	}

	@Then("^demoSite will have generated the user and allows a log in with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void demosite_will_have_generated_the_user_and_allows_a_log_in_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        WebElement Login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
        Login.click();
        WebElement UsernameLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
        UsernameLogin.sendKeys(arg1);
        WebElement PasswordLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
        PasswordLogin.sendKeys(arg2);
        WebElement TestLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
        TestLogin.click();
        String test = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
        assertEquals("**Successful Login**",test);
		System.out.println("login user");
	}

	
    @After
    public void tearDown() {
        driver.close();
    }


}