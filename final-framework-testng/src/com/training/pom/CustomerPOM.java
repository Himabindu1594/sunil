package com.training.pom;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPOM {
	
private WebDriver driver; 
	
	public CustomerPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="/html/body/div[1]/nav/ul/li[6]")
	private WebElement customerIcon;
	
	public void clickCustomerIcon()
	{
		this.customerIcon.click();
	}
	
	@FindBy(xpath="//*[@id='customer']/ul/li[1]/a")
	private WebElement customer;
	
	public void clickCustomer()
	{
		this.customer.click();
	}
	
	
	
	
    @FindBy(xpath="//li[@class='active']/following-sibling::li[3]/a")
	private WebElement Pagination;
	 
	
	@FindBy(xpath="//td[contains(text(),'Himabindu Anne')]/preceding-sibling::td//input[@name = 'selected[]']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="//td[contains(text(),'Himabindu Anne')]/following-sibling::td//child::a//child::i[@class = 'fa fa-pencil']")
	private WebElement customerEditIcon;
	
	public void clickCustomerEditIcon()
	{
		this.Pagination.click();
		this.selectCustomer.click();
		this.customerEditIcon.click();
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	public void clearFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	@FindBy(xpath="//*[@id='address']/li[2]/a")
	private WebElement clickAddressTab;
	
	public void clickAddress1Tab()
	{
		this.clickAddressTab.click();
	}
	
	@FindBy(id="input-postcode1")
	private WebElement postCode;
	
	public void sendPostcode(String postCode) {
		this.postCode.clear();
		this.postCode.sendKeys(postCode);
	}
	
	@FindBy(xpath="//*[@id='form-customer']/ul/li[4]/a")
	private WebElement rewardPointTab;
	
	public void clickrewardPointTab()
	{
		this.rewardPointTab.click();
	}
	
	@FindBy(id="input-reward-description")
	private WebElement rewardPointDescription;
	
	public void addRewardPointDescription(String rewardPointDescription) {
		this.rewardPointDescription.clear();
		this.rewardPointDescription.sendKeys(rewardPointDescription);
	}
	
	@FindBy(id="input-points")
	private WebElement rewardPoint;
	
	public void rewardPoint(String rewardPoint) {
		this.rewardPoint.clear();
		this.rewardPoint.sendKeys(rewardPoint);
	}
	
	@FindBy(id="button-reward")
	private WebElement addrewardPoint;
	
	public void addrewardPoint()
	{
		this.addrewardPoint.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement saveCustomerData;
	
	public void saveEditedCustomer()
	{
		this.saveCustomerData.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-bar-chart-o fa-fw']")
	private WebElement reportsIcon;
	
	public void clickReportsIcon()
	{
		this.reportsIcon.click();
	}
	
	@FindBy(xpath="//*[@id='reports']/ul/li[3]/a")
	private WebElement clickCustomersLink;
	
	public void clickCustomersLink()
	{
		this.clickCustomersLink.click();
	}
	
	
	  @FindBy(xpath="//a[text()='Reward Points']") 
	  private WebElement clickRewardPointsLink;
	  
	  public void clickRewardsPointLink() { 
		  this.clickRewardPointsLink.click();
		  }
	 

}
