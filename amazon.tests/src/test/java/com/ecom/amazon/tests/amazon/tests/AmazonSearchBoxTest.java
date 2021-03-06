package com.ecom.amazon.tests.amazon.tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Unit test for simple App.
 */
public class AmazonSearchBoxTest 
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
    	
		WebElement mobileLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		mobileLink.click();
		
		driver.findElement(By.xpath("//*[@id=\"dealTitle\"]")).click();
		
		Thread.sleep(3000);
    }
    
    @After
    public void closeBrowser() {
    	App.shutDownDriver();
    }
}
