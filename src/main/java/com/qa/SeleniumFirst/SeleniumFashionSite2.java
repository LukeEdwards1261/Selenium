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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFashionSite2 {

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
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
        WebElement tshirt = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
        tshirt.click();
        Thread.sleep(5000);
        WebElement fadedshortsleve = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/div/div[1]/div/a[1]/img"));
        fadedshortsleve.click();
        Thread.sleep(5000);
        WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
        addtocart.click();
        Thread.sleep(5000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a"));
        new WebDriverWait(driver,7).until(ExpectedConditions.visibilityOf(checkout));
        checkout.click();
        Thread.sleep(5000);

        
        String test = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")).getText();
        assertEquals("Faded Short Sleeve T-shirts", test);
       
    }
    


    @After
    public void tearDown() {
        driver.close();
    }
}