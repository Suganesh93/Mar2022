package org.Adcatinlocatorpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1Login extends org.BaseMethod.BaseClassMethod
{
	public P1Login() 
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="username")
	private WebElement txtusr;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	

	public WebElement getTxtusr() {
		return txtusr;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void logninPage(String username,String password) 
	{

		sendKeys(getTxtusr(), username);
		sendKeys(getTxtpass(), password);
		btnClick(getBtnlogin());
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
