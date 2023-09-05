 
package com.adactin.runnerclass;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
// PROJECT MANAGEMENT / BUILD MANAGEMENT

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\GOWTHAMI\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adactin\\feature\\Demo.feature",
glue = "com.adactin.step", 
monochrome = true, 
//tags = ("@smoke1"),
//dryRun = false,
//strict = true)
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Cucuber_Report/Adactin.html","pretty"} ) 
//FEATURE - COMBINES GLUE - COMBINES STEP DEF WITH RUNNERCLASS , MONOCHROME - CLEARS SP CHAR, STRICT - TRUE undefined steps are marked as fail and BUILD is FAILURE. ,Dry Run(TRUE) -The default value of dry run is false the Step Definition and Feature files and to verify the compilation errors. 

public class Adactin_RunnerClass  {

	public static WebDriver driver;// NUll DRIVER
	
	@BeforeClass //==> pre condition
	public static void set_up() {
		
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//driver.get("https://adactinhotelapp.com/"); 
	}
	
	
	
	


	@AfterClass //HOOKS -junit cucumber
	public static void teardown() {
		driver.close();

	}
	
	
	
	
	

}
