package PomClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class LoginPage extends UtilClass1 {
	WebDriver driver ;
	
	@FindBy(xpath="(//input[@id='LoginName'])")
	private WebElement EmailID1;
	
	@FindBy(xpath="(//input[@id='OriginalPassword'])")
	private WebElement Password;
	
	@FindBy(xpath="(//button[@id='btnsignin'])")
	private WebElement SignUP;
	
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void EmailID1() throws IOException {
		expliciteWait(driver, EmailID1 );
		EmailID1.sendKeys("barnettcandy20@gmail.com");
	}
	
	public void Password() throws IOException {
		expliciteWait(driver, Password );
		Password.sendKeys("Admin@123");
	}
	
	public void SignUP() throws IOException {
		expliciteWait(driver, SignUP );
		SignUP.click();
	}
	
			
}

