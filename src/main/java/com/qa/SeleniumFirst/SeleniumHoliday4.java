package com.qa.SeleniumFirst;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumHoliday4 {

    private WebDriver driver;
    
    public static ChromeOptions chromeCfg() {
    	 Map<String, Object> prefs = new HashMap<String, Object>();
    	 ChromeOptions cOptions = new ChromeOptions();
    	  
    	 // Settings
    	 prefs.put("profile.default_content_setting_values.cookies", 2);
    	 prefs.put("network.cookie.cookieBehavior", 2);
    	 prefs.put("profile.block_third_party_cookies", true);

    	 // Create ChromeOptions to disable Cookies pop-up
    	 cOptions.setExperimentalOption("prefs", prefs);
//    	 cOptions.setHeadless(true);

    	 return cOptions;
    	 }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luke Edwards\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\com.qa.SeleniumFirst\\src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver(chromeCfg());     //add this line instead of the one below if using google to stop its popups, otherwise use normal as this can block needed popups
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 1168));
        
        

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/newtours/");
        Thread.sleep(3000);
        WebElement Register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        Register.click();
        Thread.sleep(3000);
        WebElement Firstname = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
        Firstname.sendKeys("Jack");
        Thread.sleep(1000);
        WebElement Lastname = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
        Lastname.sendKeys("Sparrow");
        Thread.sleep(1000);
        WebElement Phone = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
        Phone.sendKeys("07404822012");
        Thread.sleep(1000);
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        Email.sendKeys("jack@aol.com");
        Thread.sleep(1000);
        WebElement address = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
        address.sendKeys("45 long road");
        Thread.sleep(1000);
        WebElement City = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
        City.sendKeys("London");
        Thread.sleep(1000);
        WebElement State = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
        State.sendKeys("Jupiter");
        Thread.sleep(1000);
        WebElement Postcode = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
        Postcode.sendKeys("SM49RG");
        Thread.sleep(1000);
        WebElement Country = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[246]"));
        Country.click();
        Thread.sleep(1000);
        String user = "username";
        WebElement Username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Username.sendKeys(user);
        Thread.sleep(1000);
        String password = "password";
        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
        Password.sendKeys(password);
        Thread.sleep(1000);
        WebElement PasswordConfirm = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
        PasswordConfirm.sendKeys(password);
        Thread.sleep(1000);
        WebElement Submit = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
        Submit.click();
        Thread.sleep(3000);
        String test1 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText();
        assertEquals("Note: Your user name is username.",test1);
        WebElement Signin = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a"));
        Signin.click();
        Thread.sleep(3000);
        WebElement Username2 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
        Username2.sendKeys(user);
        Thread.sleep(1000);
        WebElement Password2 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
        Password2.sendKeys(password);
        Thread.sleep(1000);
        WebElement Submit2 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
        Submit2.click();
        Thread.sleep(3000);
        String test2 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
        assertEquals("Login Successfully",test2);
        WebElement Flights = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
        Flights.click();
        WebElement Oneway = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
        Oneway.click();
        WebElement Passenger = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]"));
        Passenger.click();
        Thread.sleep(1000);
        WebElement Departfrom = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[3]"));
        Departfrom.click();
        Thread.sleep(1000);
        WebElement Arrivein = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[5]"));
        Arrivein.click();
        Thread.sleep(1000);
        WebElement Firstclass = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
        Firstclass.click();
        Thread.sleep(1000);
        WebElement Airline = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[3]"));
        Airline.click();
        Thread.sleep(1000);
        WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"));
        Continue.click();
        
        Thread.sleep(3000);
        
        
    
        Thread.sleep(5000);
        
        

        String test = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
        assertEquals("Note: Your user name is JackUser.",test);
       
    }
    


    @After
    public void tearDown() {
        driver.close();
    }
}