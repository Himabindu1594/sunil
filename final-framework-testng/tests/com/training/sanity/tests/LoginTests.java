package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CustomerPOM;
import com.training.pom.LoginPOM;
import com.training.pom.OrdersPOM;
import com.training.pom.SalesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CustomerPOM customerPOM;
	private OrdersPOM ordersPOM;
	private SalesPOM salesPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		customerPOM = new CustomerPOM(driver);
		ordersPOM = new OrdersPOM(driver);
		salesPOM = new SalesPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority = 0)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("Admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Sucess Login ");
		
	}
	
	
	
	  @Test(priority = 1) public void validCustomerPage() throws
	  InterruptedException {
	  
	  customerPOM.clickCustomerIcon(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Click customer Icon");
	  customerPOM.clickCustomer(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Coustomer List page");
	  customerPOM.clickCustomerEditIcon(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Customer Edit page");
	  customerPOM.clearFirstName("Deepa");
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Modified Firstname");
	  customerPOM.clickAddress1Tab(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("click Address1 Tab");
	  customerPOM.sendPostcode("8796545"); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Modified PostCode ");
	  customerPOM.clickrewardPointTab();
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Reward point Page");
	  customerPOM.addRewardPointDescription("Festival Bonaza Deshurra");
	  Thread.sleep(5000); 
	  screenShot.captureScreenShot("Modified Description");
	  customerPOM.rewardPoint("60"); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Modified Reward Point");
	  customerPOM.addrewardPoint(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Sucess Message of reward point");
	  customerPOM.saveEditedCustomer(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Sucessuly Saved customer");
	  customerPOM.clickReportsIcon(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Click on Report Icon ");
	  customerPOM.clickCustomersLink(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Click on Customer Link");
	  customerPOM.clickRewardsPointLink(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Customer list of Reward points ");
	  
	  }
	  
	  
	  
	  
	  @Test(priority = 2)
	  public void validOderPage() throws InterruptedException {
	  
	  ordersPOM.viewDashboard(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Dashboard "); 
	  ordersPOM.viewOrderPage();
	  Thread.sleep(5000); screenShot.captureScreenShot("Order page");
	  ordersPOM.genarateInvoice(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Invoice Number"); 
	  ordersPOM.selectStatus();
	  Thread.sleep(5000); 
	  screenShot.captureScreenShot("Selected Status");
	  ordersPOM.addHistory(); 
	  Thread.sleep(5000);
	  screenShot.captureScreenShot("Sucess Message");
	  
	  
	  }
	 
		  @Test(priority = 1) 
		  public void validSalesPage() throws InterruptedException {
		  
				
				salesPOM.viewDashboard();
				Thread.sleep(5000);
				screenShot.captureScreenShot("Dashboard 1 ");
				 
		  salesPOM.clickSalesIcon();
		  Thread.sleep(5000); 
		  screenShot.captureScreenShot("Sales Icon");
		  salesPOM.clickOrdersLink(); 
		  Thread.sleep(5000);
		  screenShot.captureScreenShot("OrdersLink"); 
		  salesPOM.clickAddNewIconIcon();
		  Thread.sleep(5000); 
		  screenShot.captureScreenShot("AddNew Icon");
		  salesPOM.sendFirstName("Himabindu"); 
		  Thread.sleep(5000);
		  screenShot.captureScreenShot("First Name");
		  salesPOM.sendLastName("Anne"); 
		  Thread.sleep(5000);
		  screenShot.captureScreenShot("Last Name");
		  salesPOM.sendEmail("bindu.Anne@gmail.com"); 
		  Thread.sleep(5000);
		  screenShot.captureScreenShot("Email");
		  salesPOM.sendTelephone("7687696097");; 
		  Thread.sleep(5000);
		  screenShot.captureScreenShot("Telephone");
		  salesPOM.clickContinueButton();
		  Thread.sleep(5000); 
		  screenShot.captureScreenShot("Products Page");
		  
		  
		  }
		 
	 
	
}
