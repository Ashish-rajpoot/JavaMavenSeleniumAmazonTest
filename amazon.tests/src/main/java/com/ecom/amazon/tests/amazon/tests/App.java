package com.ecom.amazon.tests.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import okhttp3.OkHttpClient;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.chrome.*;

/**
 * Hello world!
 *
 */
public class App 
{
       
    public static void initWebDriver() {
    	new OkHttpClient().newBuilder().connectTimeout(100, TimeUnit.SECONDS)
    			.readTimeout(100,TimeUnit.SECONDS)
    			.writeTimeout(100, TimeUnit.SECONDS)
    			.build();
    	System.setProperty("webdriver.chrome.driver","F:\\Selenium Project\\Amazon-Project\\driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	RunEnvironment.setWebDriver(driver);
    }
   

	public static void shutDownDriver() {
		// TODO Auto-generated method stub
		RunEnvironment.getWebDriver().quit();
		
	}
}
