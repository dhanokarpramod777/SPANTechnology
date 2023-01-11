package PomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class HomePage extends UtilClass1 {
	//ExtensionforBusiness Returns - Form History

	
WebDriver driver ;
	
	@FindBy(xpath="(//a[@id='linkglobalSettings'])")
	private WebElement FormHistory;
	
	@FindBy(xpath="//*[@id=\"ulglobalSettings\"]/li[3]/a")
	private WebElement form7004;
	
	@FindBy(xpath="(//*[@id=\"createextension\"])/div/a[2]")
	private WebElement ExtensionforBusinesReturns;
	
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void is_FormHistory() throws IOException {
		expliciteWait(driver, FormHistory );
		FormHistory.click();
	}
	
	public void is_form7004 () throws IOException {
		expliciteWait(driver, form7004 );
		form7004.click();
	}
	public void is_ExtensionforBusinesReturns () throws IOException {
		expliciteWait(driver, ExtensionforBusinesReturns );
		ExtensionforBusinesReturns.click();
	}

	
	
}
