package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrdersPOM {
	
private WebDriver driver; 
	
	public OrdersPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='dashboard']/a")
	private WebElement viewdashboard; 
	
	@FindBy(xpath="//td[contains(text(),'Himabindu Anne')]/following-sibling::td//child::a//child::i[@class='fa fa-eye']")
	private WebElement viewOrderPage;
	
	@FindBy(xpath="//*[@id='button-invoice']")
	private WebElement genarateInvoice; 
	
	@FindBy(name="order_status_id")
	private WebElement selectStatus;
	
	@FindBy(id="button-history")
	private WebElement addHistory;
	
	public void viewDashboard() {
		this.viewdashboard.click();
	}
	
	public void viewOrderPage() {
		this.viewOrderPage.click(); 
	}
	
	public void genarateInvoice() {
		this.genarateInvoice.click(); 
	}
	
	public void selectStatus() {
		Select selc = new Select(selectStatus);
		selc.selectByVisibleText("Complete");
	}
	
	public void addHistory() {
		
		this.addHistory.click();
	}

}
