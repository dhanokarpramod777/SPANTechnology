package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Class {

	public static WebDriver geckodriver() {
		
		  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Java\\SeleniumProject\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	         WebDriver driver = new FirefoxDriver();
		 	driver.manage().window().maximize();
		    driver.get("https://ees.efile4taxes.com/User/AccountLogIn");
		     return driver;
		
	}
	
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports report;
	static ExtentTest test;

	public static ExtentTest getTestForReporter(String useCase)
	{
		
		return test = report.createTest(useCase);
	}
	
	public static ExtentHtmlReporter getHtmlReporter()
	{
		if(htmlReporter == null)
		{
			htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
			
		}
		
		return htmlReporter;
	}
	
	public static ExtentReports getExtentReport()
	{
		if(report == null)
		{
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
		}
		
		return report;
	}

}
