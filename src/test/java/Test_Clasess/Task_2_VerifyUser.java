package Test_Clasess;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import BaseClasses.Base_Class;
import PomClasses.BusinessDetailsProfile;
import PomClasses.HomePage;
import PomClasses.LoginPage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class Task_2_VerifyUser {
	WebDriver driver ;
	
	LoginPage lp ;
	HomePage hp ;
	BusinessDetailsProfile bp;
	

	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	 @BeforeClass
	  public void beforeClass() {
		 driver=Base_Class.geckodriver();
		 
		 htmlReporter = Base_Class.getHtmlReporter();
		report = Base_Class.getExtentReport();
		test = Base_Class.getTestForReporter("Task_2_VerifyUser");
		 
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  lp = new LoginPage(driver);  
		  hp = new HomePage(driver);
		  bp = new BusinessDetailsProfile(driver) ;
	  }
  @Test(priority=1)
  public void VerifyUserLogin() throws IOException {
	  lp.EmailID1();
	  lp.Password();
	  
	  
	  
	  
	  lp.SignUP(); 
  }

  @Test(priority=2)
  public void VerifyUser_Home() throws IOException {
	  hp.is_FormHistory();
	  hp.is_form7004();
	 
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {

	  if(result.getStatus() == ITestResult.SUCCESS){
			test.log(Status.PASS, "Test is passed " + result.getName());
		}
		else
		{
			String path = hp.getScreenShot(driver, result.getName());
			test.log(Status.FAIL, "Test is failed " + result.getName(), 
			MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}  			  
  } 
@AfterClass
public void afterClass() {
	System.out.println("Code is work good");
	
  report.flush();
  driver.quit();  
}
}