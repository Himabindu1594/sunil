package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPOM {

	private WebDriver driver;

	public SalesPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id='dashboard']/a")
	private WebElement viewdashboard; 
	
	public void viewDashboard() {
		this.viewdashboard.click();
	}
	
	@FindBy(xpath="//*[@id='sale']/a")
	private WebElement salesIcon;
	
	public void clickSalesIcon()
	{
		this.salesIcon.click();
	}
	
	@FindBy(xpath="//*[@id='sale']/ul/li[1]/a")
	private WebElement ordersLink;
	
	public void clickOrdersLink()
	{
		this.ordersLink.click();
	}
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement addNewIcon;
	
	public void clickAddNewIconIcon()
	{
		this.addNewIcon.click();
	}
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	@FindBy(name="email")
	private WebElement email;
	
	public void sendEmail(String email) {
		this.email.sendKeys(email);
	}
	
	@FindBy(name="telephone")
	private WebElement telephone;
	
	public void sendTelephone(String telephone) {
		this.telephone.sendKeys(telephone);
	}
	
	@FindBy(xpath="//*[@id='button-customer']")
	private WebElement continueButton;
	
	public void clickContinueButton()
	{
		this.continueButton.click();
	}
	
	//*[@id="button-customer"]
}
