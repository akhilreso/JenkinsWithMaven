/**
 * 
 */
package com.jenkins.withmaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author akhil
 * @since 04/02/2021
 */
public class JenkinsWithMavenTest {
	WebDriver driver;  
	@Test
	public void jenkinsWithMaven(){
		String browserName = System.getProperty("BrowserName");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./exeFile/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://github.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    System.out.println(driver.getTitle());
		    driver.close();
		}
		
	}

}
