package Test_Clasess;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClasses.Base_Class;
import PomClasses.AuditForm7004;
import PomClasses.BusinessDetailsProfile;
import PomClasses.FilingFeesForm7004;
import PomClasses.FormInterview;
import PomClasses.HomePage;
import PomClasses.InprogressReturns;
import PomClasses.LogOutUser;
import PomClasses.LoginPage;
import PomClasses.PaymentPage;
import PomClasses.SummaryForm;
import PomClasses.TaxYearForm;
import PomClasses.TentativeTaxandPayments;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class Task_1_VerifyUser {
	WebDriver driver ;
	
	LoginPage lp ;
	HomePage hp ;
	BusinessDetailsProfile bp;
	FormInterview fi;
	TaxYearForm tf ;
	TentativeTaxandPayments tp ;
	SummaryForm sf ;
	InprogressReturns IR;
	AuditForm7004 af7 ;
	FilingFeesForm7004 fff7;
	PaymentPage pp ;
	LogOutUser lo ;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;
	
	 @BeforeClass
	  public void beforeClass() {
		 driver=Base_Class.geckodriver();
		 
		 htmlReporter = Base_Class.getHtmlReporter();
			report = Base_Class.getExtentReport();
			test = Base_Class.getTestForReporter("Task_1_VerifyUser");
			
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  lp = new LoginPage(driver);  
		  hp = new HomePage(driver);
		  bp = new BusinessDetailsProfile(driver) ;
		  fi = new FormInterview (driver);
		  
		  
		  tf = new TaxYearForm(driver);
		  tp = new TentativeTaxandPayments(driver);
		  sf = new SummaryForm(driver);
		  IR = new InprogressReturns (driver);
		  af7 = new AuditForm7004(driver);
		  fff7 = new FilingFeesForm7004 (driver) ;
		  pp = new PaymentPage(driver);	  
		  lo = new LogOutUser(driver);
	  }
	  
	  SoftAssert soft = new SoftAssert();

  @Test(priority=1)
  public void VerifyUser_Login() throws IOException {
	  lp.EmailID1();
	  lp.Password();
	  lp.SignUP(); 
  }

  @Test(priority=2)
  public void VerifyUser_Home() throws IOException {
	  hp.is_FormHistory();
	  hp.is_form7004();
	  hp.is_ExtensionforBusinesReturns();  
  }
  
  
  @Test(priority=3)
  public void VerifyUser_DetailsProfile() throws IOException, InterruptedException {
	  bp.is_BusinessName1();
	  bp.is_EIN2();
	  bp.is_ConfirmEIN3();
	  bp.is_checkbox4();
	  bp.is_Address15();
	  bp.is_Address26();
	  bp.is_City7();
	  bp.is_State8();
	  bp.is_MyCountries9();
	  bp.is_txtzip10();
	  bp.is_SAName11();
	  bp.is_SATitle12();
	  bp.is_SADayTimePhone13();
	  bp.is_btnNext14();
 
  }
  
  
  @Test(priority=4)
  public void VerifyUserForm_Interview() throws IOException {
	 
	  fi.is_BusinessTex1();
	  fi.is_LNextButton3();
  }
  

  @Test(priority=5)
  public void VerifyUserTaxYearForm() throws IOException {
	 tf.is_FiscalShortTaxYear1();
	 tf.is_TaxYearBeginDate2();
	 tf.is_BeginDate3();
	 tf.is_TaxYearEndDate4();
	 tf.is_EndinDate5();
	 tf.is_InitialReturn2();
	 tf.is_Businescorporation3();
	 tf.is_NextButton4();
	 
  }
  
  
  @Test(priority=6)
  public void VerifyUserTentativeTaxandPayments() throws IOException {
	tp.is_formhelpbg1();
	tp.is_StepNext2(); 
  }
  
  
  @Test(priority=7)
  public void VerifyUserSummaryForm() throws IOException {
	sf.is_StepNext1();
  }
  
  
  @Test(priority=8)
  public void VerifyUserInprogressReturns() throws IOException {
	IR.is_StepNext1();
  }
  
  
  @Test(priority=9)
  public void VerifyUserAuditForm7004() throws IOException {
	  
	  af7.is_StepNextAF7();	  
  }
  
  
  @Test(priority=10)
  public void VerifyUserFilingFeesForm7004() throws IOException {
	fff7.is_StepNextfff7();
  }

  
  @Test(priority=11)
  public void VerifyUserPaymentPagevisiable() throws IOException {
	
	  Assert.assertTrue(pp.is_cardheaderVisiable()); 
  }
  
  
  @Test(priority=12)
  public void VerifyUserLogOutUser() throws IOException {
	  lo.is_ProfileButton1();
	  lo.is_LogOutButton2();
	  lo.is_SubmitLogOutButton3();
	  lo.is_PleaseClickHere4();
  }
  
  
  @Test(priority=13)
  public void VerifyUser_LoginBack() throws IOException {
	  lp.EmailID1();
	  lp.Password();
	  lp.SignUP(); 
  }
  
  
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	  
  }
 
  @AfterClass
  public void afterClass() {
	driver.quit();
	  
  }

}
