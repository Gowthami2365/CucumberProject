package com.BaseClassprop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class baseclass {

		public static WebDriver driver;
		
		public static WebDriver browserlaunch(String browser) {
			
			if(browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
			}else if (browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
				
				driver = new FirefoxDriver();
				
			}			
				driver.manage().window().maximize();
				
				return driver;
		}
		
		public static WebDriver geturl(String url) {
			
			driver.get(url);
			return driver;

		}
		
		public static void click(WebElement clickelement) {

			clickelement.click();
			
		}
		public static void sendkeys(WebElement sendelement, String id) {
		
			sendelement.sendKeys(id);

		}
		
		public static void navigateTo(String url) {

			driver.navigate().to(url);
		}
		
		public static void navigateBack() {

			driver.navigate().back();
		} 
		
		public static void navigateForward() {

			driver.navigate().forward();
			
		}
		
		public static void refresh() {

			driver.navigate().refresh();
		}
		
		public static void dropdown(WebElement element, String type, String value) {

			Select s = new Select(element);
			element.getLocation();
			
			if (type.equalsIgnoreCase("Index")) {
				
				int index = Integer.parseInt(value);
				
				s.selectByIndex(index);
				
			}
			else if (type.equalsIgnoreCase("Value")) {
				
				s.selectByValue(value);
			
			}
			else if (type.equalsIgnoreCase("Visibletext")) {
				
				s.selectByVisibleText(value);
				
			}
		}
		
		public static void screenshot(String sourcepath) throws IOException {

			TakesScreenshot sc = (TakesScreenshot) driver;
			
			File source = sc.getScreenshotAs(OutputType.FILE);
			
			File destination = new File(sourcepath);
			
			FileUtils.copyFile(source,destination);;
		}
		
		public static void radioButton(WebElement radioelement) {
			
			radioelement.click();

		}
		public static void alert(String alerttype, String sendtext) {
			if (alerttype.equals("alert")) {
				
				driver.switchTo().alert().accept();
			}
			else if (alerttype.equalsIgnoreCase("alertokcancel")) {
				
				driver.switchTo().alert().dismiss();
				
			}
			else if (alerttype.equalsIgnoreCase("alerttext")) {
				driver.switchTo().alert().sendKeys(sendtext);
				driver.switchTo().alert().accept();
			}
		}
		
		public static void action(WebElement actionelement, String type) {
			
			Actions ac = new Actions(driver);
			
			if (type.equalsIgnoreCase("click")) {
				
				ac.click(actionelement).build().perform();
				
			}else if (type.equalsIgnoreCase("contextClick")) {
				
				ac.contextClick(actionelement).build().perform();
				
			}else if (type.equalsIgnoreCase("moveToElement")) {
				
				 ac.moveToElement(actionelement).click().build().perform();
			}
			else if (type.equalsIgnoreCase("doubleClick")) {
				ac.doubleClick().build().perform();
			}
			
		}
		public static void frames() {

			
		}

		public static void waits() {
			
		}
		public static void windowHandles() {

			
		}
		public static void checkbox() {
			// TODO Auto-generated method stub

		}
		public static void isEnable() {
			// TODO Auto-generated method stub

		}
		public static void isDisplayed() {
			// TODO Auto-generated method stub

		}
		public static void isSelected() {
			// TODO Auto-generated method stub

		}
		public static void isMultiple() {
			// TODO Auto-generated method stub

		}
		public static void getOptions() {
			// TODO Auto-generated method stub

		}
		public static void getTitle() {
			// TODO Auto-generated method stub

		}
		public static void getCurrenturl() {
			// TODO Auto-generated method stub

		}
		public static void getText() {
			// TODO Auto-generated method stub

		}
		public static void getAttribute() {
			// TODO Auto-generated method stub

		}

		public static void scrollupanddown() {
			// TODO Auto-generated method stub

		}
		public static void getFirstselectedoptions() {
			// TODO Auto-generated method stub

		}
		public static void getAllselectedoptions() {
			// TODO Auto-generated method stub

		}
				
		public static WebDriver close() {
			
			driver.close();
			return driver;
			
		}
		public static WebDriver quit() {

			driver.quit();
			return driver;
			
		}
	}

