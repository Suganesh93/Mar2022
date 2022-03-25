package org.Adcatinlocatorpom;

import org.BaseMethod.BaseClassMethod;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2SearchHotel extends BaseClassMethod
{

	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement slctLocation;

	@FindBy(id="hotels")
	private WebElement slctHotels;

	@FindBy(id="room_type")
	private WebElement slctRoomtype;

	@FindBy(id="room_nos")
	private WebElement slctNoOfromms;

	@FindBy(id="datepick_in")
	private WebElement txtdateIN;

	@FindBy(id="datepick_out")
	private WebElement txtdateOUT;

	@FindBy(id="adult_room")
	private WebElement slctAdultrm;

	@FindBy(id="child_room")
	private WebElement slctChild;

	@FindBy(id="Submit")
	private WebElement btnClk;

	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selecthotel;

	@FindBy(id="location_span")
	private WebElement locationerror;

	@FindBy(id="checkin_span")
	private WebElement checkinerror;

	@FindBy(id="checkout_span")
	private WebElement checkouterror;






	public WebElement getSlctLocation() {
		return slctLocation;
	}

	public WebElement getSlctHotels() {
		return slctHotels;
	}

	public WebElement getSlctRoomtype() {
		return slctRoomtype;
	}

	public WebElement getSlctNoOfromms() {
		return slctNoOfromms;
	}

	public WebElement getTxtdateIN() {
		return txtdateIN;
	}

	public WebElement getTxtdateOUT() {
		return txtdateOUT;
	}

	public WebElement getSlctAdultrm() {
		return slctAdultrm;
	}

	public WebElement getSlctChild() {
		return slctChild;
	}

	public WebElement getBtnClk() {
		return btnClk;
	}




	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getLocationerror() {
		return locationerror;
	}

	public WebElement getCheckinerror() {
		return checkinerror;
	}

	public WebElement getCheckouterror() {
		return checkouterror;
	}

	public void searchHotel() 
	{
		btnClick(getBtnClk());
	}

	public void searchHotel(String location ,String hotels,String room_type,String room_nos,String datepick_in,String datepick_out,String adult_room,String child_room )
	{
		common(location, room_nos, datepick_in, datepick_out, adult_room);
		dropDownSelect(getSlctHotels(), "visibletext", hotels);
		dropDownSelect(getSlctRoomtype(), "visibletext", room_type);
		dropDownSelect(getSlctChild(), "visibletext", child_room);
		searchHotel();
	}



	public void searchHotel(String location ,String room_nos,String datepick_in,String datepick_out,String adult_room)
	{
		common(location, room_nos, datepick_in, datepick_out, adult_room);
		searchHotel();
	}

	public void searchHotel(String location ,String datepick_in,String datepick_out)
	{

		dropDownSelect(getSlctLocation(), "visibletext", location);
		javascrpt(datepick_in, getTxtdateIN());
		javascrpt(datepick_out, getTxtdateOUT());
		searchHotel();
		
	}

	public void common(String location ,String room_nos,String datepick_in,String datepick_out,String adult_room) {

		dropDownSelect(getSlctLocation(), "visibletext", location);
		dropDownSelect(getSlctNoOfromms(), "visibletext", room_nos);
		dropDownSelect(getSlctAdultrm(), "visibletext", adult_room);
		javascrpt(datepick_in, getTxtdateIN());
		javascrpt(datepick_out, getTxtdateOUT());

	}


	public void verifylocation(String expectedResult) {
		String actualResult = getText(getLocationerror());
		Assert.assertEquals("verify location message displayed", expectedResult, actualResult);
		

	}

	public void selecthoteltext(String expectedResult) {
		String actualResult = getText(getSelecthotel());
		Assert.assertEquals("verify selecthtole navigation message displayed", expectedResult, actualResult);
	}

	public void checkin(String expectedResult) {
		String actualResult = getText(getCheckinerror());
		Assert.assertEquals("verify checkin message displayed", expectedResult, actualResult);
	}
	
	public void checkout(String expectedResult1) {
		String actualResult = getText(getCheckouterror());
		Assert.assertEquals("verify checkin message displayed", expectedResult1, actualResult);
		
	}


}
