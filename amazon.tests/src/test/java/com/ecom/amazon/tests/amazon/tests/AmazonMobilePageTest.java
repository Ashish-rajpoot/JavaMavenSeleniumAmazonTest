package com.ecom.amazon.tests.amazon.tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class AmazonMobilePageTest 
{
    @Before
    
    public void startBrowser() {
    	App.initWebDriver();
    }
    
    @Test
     public void MobilePageTest() throws InterruptedException {
    	WebDriver driver = RunEnvironment.getWebDriver();
    	final String siteUrl = "https://www.amazon.in";
    	driver.get(siteUrl);
    	
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Open plus");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).submit();
		
//		Thread.sleep(3000);
    }
    
    @After
    public void closeBrowser() {
    	App.shutDownDriver();
    }
}
