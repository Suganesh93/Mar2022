package ord.stepDefi;

import org.Adcatinlocatorpom.P1Login;
import org.Adcatinlocatorpom.P2SearchHotel;
import org.BaseMethod.BaseClassMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClassMethod
{	
	
	P2SearchHotel hotel = new P2SearchHotel();
	@Given("user should enter {string},{string} and click login")
	public void userShouldEnterAndClickLogin(String username,String password) {
		P1Login login = new P1Login();
		login.logninPage(username, password);
	}

	@When("user should enter the {string},{string},{string},{string},{string},{string},{string},{string} and click search button")
	public void userShouldEnterTheAndClickSearchButton(String location ,String hotels,String room_type,String room_nos,String datepick_in,String datepick_out,String adult_room,String child_room ) {
		hotel.searchHotel(location, hotels, room_type, room_nos, datepick_in, datepick_out, adult_room, child_room);
	}

	@Then("user should validate that page should be navigate to {string}")
	public void userShouldValidateThatPageShouldBeNavigateTo(String expectedResult) {
		
	hotel.selecthoteltext(expectedResult);
	}

	@When("user should enter the {string},{string},{string},{string},{string} and click search button")
	public void userShouldEnterTheAndClickSearchButton(String location ,String room_nos,String datepick_in,String datepick_out,String adult_room) {
	
	hotel.searchHotel(location, room_nos, datepick_in, datepick_out, adult_room);
	}

	@When("user should enter the {string},{string},{string}, and click search button")
	public void userShouldEnterTheAndClickSearchButton(String location ,String datepick_in,String datepick_out) {
		hotel.searchHotel(location, datepick_in, datepick_out);
	}

	@Then("user should validate {string} and {string} message is displayed")
	public void userShouldValidateAndMessageIsDisplayed(String expectedResult, String expectedResult1) {
		hotel.checkin(expectedResult);
		hotel.checkout(expectedResult1);
	}

	
	@When("user should click search button")
	public void userShouldClickSearchButton() 
	{
		
		hotel.searchHotel();
	}

	@Then("user should validate {string} message is displayed")
	public void userShouldValidateMessageIsDisplayed(String expectedResult) {
		hotel.verifylocation(expectedResult);
	}


}
