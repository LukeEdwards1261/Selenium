package com.qa.SeleniumFirst;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StockMarket3 {
	
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
    	
    	WebElement targ;
    	List<WebElement> targList;
    	
    	String result;
    	
        driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);        
        targList = driver.findElements(By.xpath("//*[@id=\"view-constituents\"]/div[2]/table/tbody"));
        ArrayList<String[]> myRisers = new ArrayList();
        String msg;
        
        System.out.print("size of list: "+ targList.toArray().length);
        
        for (WebElement element : targList) {
        	msg = element.getText();
        	System.out.println("- " + msg);
        	myRisers.add(msg.split("\n"));
        }
        
        int x = 0;
        double highestVal = 0;
        String nameHighest = "";
        String[] resultHighest = {};
        
        for (String[] strArray : myRisers) {
        
        	for (String item : strArray) {
        		if (x == 1) {
        			System.out.print("-" + item + ",\t");
        			item = item.replace(",","");
        			if (Double.parseDouble(item) > highestVal) {
        				highestVal = Double.parseDouble(item);
        				resultHighest = strArray;
        			}
        		}
        		x++;
        		
        	}
        	System.out.println();
        	x = 0;
        }
    		System.out.println("Highest Price: " + highestVal);
    		
    		for (String j : resultHighest) {
    			System.out.println(j);
    		}
        

       
    }
    
    
    


    @After
    public void tearDown() {
        driver.close();
    }

}
    

