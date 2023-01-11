package PomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class FormInterview extends UtilClass1{
	
WebDriver driver ;
	
	@FindBy(xpath="(//button[@id='btn3'])")
	private WebElement BusinessTex;
	
	@FindBy(xpath="(//input[@id='btnNext'])")
	private WebElement NextButton;
	
	public FormInterview (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	public void is_BusinessTex1 () throws IOException {
		expliciteWait(driver, BusinessTex );
		BusinessTex.click();
	}
	
	public void is_LNextButton3() throws IOException {
		expliciteWait(driver, NextButton );
		NextButton.click();
	}
	
	
}
