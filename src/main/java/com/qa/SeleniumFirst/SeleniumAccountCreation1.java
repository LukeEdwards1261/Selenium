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

public class SeleniumAccountCreation1 {

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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luke Edwards\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\com.qa.SeleniumFirst\\src\\test\\resources\\chromedriver.exe");
//        driver = new ChromeDriver(chromeCfg());     //add this line instead of the one below if using google to stop its popups, otherwise use normal as this can block needed popups
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 1168));
        
        

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://thedemosite.co.uk/");
        Thread.sleep(5000);
        WebElement AddAUser = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
        AddAUser.click();
        Thread.sleep(5000);
        WebElement Username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
        Username.sendKeys("username1");
        Thread.sleep(1000);
        WebElement Password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
        Password.sendKeys("password1");
        Thread.sleep(1000);
        WebElement SaveUser = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
        SaveUser.click();
        Thread.sleep(1000);
        WebElement Login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
        Login.click();
        Thread.sleep(1000);
        WebElement UsernameLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
        UsernameLogin.sendKeys("username1");
        Thread.sleep(1000);
        WebElement PasswordLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
        PasswordLogin.sendKeys("password1");
        Thread.sleep(1000);
        WebElement TestLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
        TestLogin.click();
        Thread.sleep(5000);
        
    
        Thread.sleep(5000);
        
        

        
        assertEquals("kittens - Google Search", driver.getTitle());
       
    }
    


    @After
    public void tearDown() {
        driver.close();
    }
}