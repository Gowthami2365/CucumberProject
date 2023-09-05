package com.BaseClassprop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keywords {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAMI\\eclipse-workspace\\Maven_Project"
				+ "\\Driver_106\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
	}
	driver.manage().window().maximize();
	return driver;
	
}
	public static String getUrl(String url) {
		driver.get(url);
		return url;
	}
}
