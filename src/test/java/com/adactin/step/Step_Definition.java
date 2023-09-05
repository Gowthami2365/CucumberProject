package com.adactin.step;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runnerclass.Adactin_RunnerClass;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.*;

public class Step_Definition {

	public static WebDriver driver = Adactin_RunnerClass.driver;

	@Given("^user Lauch The Adactin Application$")
	public void user_Lauch_The_Adactin_Application() throws Throwable {
		WebDriverManager.chromedriver().setup(); // syntax for browser launch
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enters The username In The user name field$")
	public void user_Enters_The_username_In_The_user_name_field() throws Throwable {

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Gowthami001");

	}

	@Then("^user Enters The Password In The Password field$")
	public void user_Enters_The_Password_In_The_Password_field() throws Throwable {

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Gowthami9850@");

	}

	@Then("^user Clicks The Login button$")
	public void user_Clicks_The_Login_Button() throws Throwable {

		WebElement Login = driver.findElement(By.xpath("//input[@name='login']"));
		Login.click();
	}

	@When("^user Selects The Location In Location Field From Drop Down List$")
	public void user_Selects_The_Location_In_Location_Field_From_Drop_Down_List() throws Throwable {

		WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(Location);
		s.selectByVisibleText("London");

	}

	@When("^user Selects The Hotel In The Hotels Field From Drop Down List$")
	public void user_Selects_The_Hotel_In_The_Hotels_Field_From_Drop_Down_List() throws Throwable {

		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select f = new Select(Hotels);
		f.selectByIndex(4);

	}

	@When("^user Selects The Room Type In RoomType Field From Drop Down List$")
	public void user_Selects_The_Room_Type_In_RoomType_Field_From_Drop_Down_List() throws Throwable {

		WebElement Room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select g = new Select(Room);
		g.selectByValue("Super Deluxe");

		Thread.sleep(5000);
	}

	@When("^user Selects No\\.Of Rooms In The Number of Rooms From DropDown List$")
	public void user_Selects_No_Of_Rooms_In_The_Number_of_Rooms_From_DropDown_List() throws Throwable {

		WebElement nosRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select o = new Select(nosRoom);
		o.selectByValue("3");

	}

	@When("^user Enters The Check In Date$")
	public void user_Enters_The_Check_In_Date() throws Throwable {

		WebElement Datein = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Datein.sendKeys("02/10/22");
	}

	@When("^user Enters The Check Out Date$")
	public void user_Enters_The_Check_Out_Date() throws Throwable {

		WebElement DateOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		DateOut.sendKeys("06/10/22");

	}

	@When("^user Enters Adults Per Room In Adults PerRoom Field$")
	public void user_Enters_Adults_Per_Room_In_Adults_PerRoom_Field() throws Throwable {

		WebElement Adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select h = new Select(Adult);
		h.selectByIndex(2);
	}

	@When("^user Enters Children Per Room In Children PerRoom Field$")
	public void user_Enters_Children_Per_Room_In_Children_PerRoom_Field() throws Throwable {

		WebElement Child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select k = new Select(Child);
		k.selectByIndex(2);

	}

	@Then("^user Clicks The Search Button$")
	public void user_Clicks_The_Search_Button() throws Throwable {

		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();

	}

	@When("^user Clicks The Radio Button For The Confirmation Of Booking The Hotel Room With Selected Date And Price With GST$")
	public void user_Clicks_The_Radio_Button_For_The_Confirmation_Of_Booking_The_Hotel_Room_With_Selected_Date_And_Price_With_GST()
			throws Throwable {

		WebElement Radiobutton = driver.findElement(By.id("radiobutton_0"));
		Radiobutton.click();

	}

	@Then("^user Clicks The Continue Button$")
	public void user_Clicks_The_Continue_Button() throws Throwable {
		WebElement Continue = driver.findElement(By.name("continue"));
		Continue.click();

	}

	@When("^user Enters First Name In The First Name Field$")
	public void user_Enters_First_Name_In_The_First_Name_Field() throws Throwable {

		WebElement Firstname = driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Gowthami");

	}

	@When("^user Enters The Last Name In THe Last Name Field$")
	public void user_Enters_The_Last_Name_In_THe_Last_Name_Field() throws Throwable {
		WebElement Lastname = driver.findElement(By.name("last_name"));
		Lastname.sendKeys("Sekar");

	}

	@When("^user Enters The Billing Address In THe Billing Address Field$")
	public void user_Enters_The_Billing_Address_In_THe_Billing_Address_Field() throws Throwable {

		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("18,Vadapalani,Chennai");

	}

	@When("^user Enters The  Credit Card No In The Credit Card Field$")
	public void user_Enters_The_Credit_Card_No_In_The_Credit_Card_Field() throws Throwable {

		WebElement Billing = driver.findElement(By.name("cc_num"));
		Billing.sendKeys("1234567891011121");

	}

	@When("^user Selects The Credit Card Type From The Drop Down List In the Credit Card Type Field$")
	public void user_Selects_The_Credit_Card_Type_From_The_Drop_Down_List_In_the_Credit_Card_Type_Field()
			throws Throwable {

		WebElement Creditcard = driver.findElement(By.name("cc_type"));
		Select a = new Select(Creditcard);
		a.selectByIndex(3);

	}

	@When("^user Selects The Expiry Date,Month,Year From The Drop Down List In The Expiry Date Field$")
	public void user_Selects_The_Expiry_Date_Month_Year_From_The_Drop_Down_List_In_The_Expiry_Date_Field()
			throws Throwable {

		WebElement expireddate = driver.findElement(By.name("cc_exp_month"));
		Select l = new Select(expireddate);
		l.selectByIndex(1);

		WebElement expireyear = driver.findElement(By.name("cc_exp_year"));
		Select b = new Select(expireyear);
		b.selectByIndex(6);

	}

	@When("^user Enters The Cvv No In The Cvv Number Field$")
	public void user_Enters_The_Cvv_No_In_The_Cvv_Number_Field() throws Throwable {

		WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		ccv.sendKeys("1234");

	}

	@Then("^user Clicks Book Now Button$")
	public void user_Clicks_Book_Now_Button() throws Throwable {

		WebElement booknow = driver.findElement(By.xpath("//input[@type=\'button\']"));
		booknow.click();

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\TakesScreenshot\\E1.png");
		FileUtils.copyFile(source, destination);

		driver.findElement(By.xpath("//input[@name='logout']")).click();

	}

	@Then("^user Clicks The Logout Button$")
	public void user_Clicks_The_Logout_Button() throws Throwable {

		driver.findElement(By.xpath("//input[@name='logout']")).click();

	}

}
