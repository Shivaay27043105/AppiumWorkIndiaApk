package StepDefinitions;

import java.util.concurrent.TimeUnit;

import Base_File.TestBase;
import Hooks.Hooks1;
import Operations.Page1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Resgister extends TestBase  {
	//private  AppiumDriver<MobileElement> driver;
	Page1 obj;
	

	public  Resgister() {
		
		this.driver=Hooks1.GetDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Given("^initialise the App$")
	
	public void initialise_the_App() throws Throwable {
		
	    obj=new Page1(driver);
	}

	@When("^User Enters the Name \"([^\"]*)\"$")
	
	public void user_Enters_the_Name(String arg1) throws Throwable {
		
	    obj=new Page1(driver);
	    obj.name(arg1);
	    
	}

	@When("^User Enters the Phone Number \"([^\"]*)\"$")
	
	public void user_Enters_the_Phone_Number(String arg1) throws Throwable {
		
		obj=new Page1(driver);
	    obj.number(arg1);
	    
	}

	@Then("^User submit the details$")
	
	public void user_submit_the_details() throws Throwable {
		
		obj=new Page1(driver);
	    obj.submit();
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	@Then("^user select the option$")
	
	public void user_select_the_option() throws Throwable {
		
		obj=new Page1(driver);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    obj.Selectoption();
	    
	}

	@Then("^user enter the location \"([^\"]*)\"$")
	public void user_enter_the_location(String arg1) throws Throwable {
		obj=new Page1(driver);
	    obj.Enterlocation(arg1);
	}

	@Then("^user click on the next button$")
	public void user_click_on_the_next_button() throws Throwable {
		obj=new Page1(driver);
	    obj.next();
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Then("^user select gender$")
	public void user_select_gender() throws Throwable {
		
		obj=new Page1(driver);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    obj.gender();
	}

	@Then("^user select qualification$")
	public void user_select_qualification() throws Throwable {
		obj=new Page1(driver);
		obj.qualification_option();
	}

	@Then("^user select medium$")
	public void user_select_medium() throws Throwable {
		obj=new Page1(driver);
		obj.medium_option();
	}

	@Then("^user select language$")
	public void user_select_language() throws Throwable {
		obj=new Page1(driver);
		obj.language_option();
	}

	@Then("^user select Experience$")
	public void user_select_Experience() throws Throwable {
		TestBase.verticleswipebypercentage(0.70, 0.10, 0.50);

		obj=new Page1(driver);
		obj.experience_option();
	}

	@Then("^user select Age$")
	public void user_select_Age() throws Throwable {
		obj=new Page1(driver);
		obj.year_option();
		obj.age_option();
	}

	@Then("^user select interest$")
	public void user_select_interest() throws Throwable {
		TestBase.verticleswipebypercentage(0.70, 0.10, 0.50);

		obj=new Page1(driver);
		obj.interest();
	}

	@Then("^User goes to the next page$")
	public void user_goes_to_the_next_page() throws Throwable {
	    
		obj=new Page1(driver);
		obj.Submit_Details();
	}
	@Then("User Select there preference")
	public void user_select_there_preference() {
		obj=new Page1(driver);
		obj.Hardware_Choose();
	}

	@Then("User tells about the Degree")
	public void user_tells_about_the_degree() {
		obj=new Page1(driver);
		obj.Degree_Details();
	}

	@Then("User Select the Language")
	public void user_select_the_language() {
		logger.info("Registration Worked Successfully ");
		obj=new Page1(driver);
		
		obj.English_Choose();
	}

}
