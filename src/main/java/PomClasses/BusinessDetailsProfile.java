package PomClasses;

import java.io.IOException;

import javax.swing.Action;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClasses.UtilClass1;

public class BusinessDetailsProfile extends UtilClass1{
	
	
WebDriver driver ;
	
	@FindBy(xpath="(//input[@id='BusinessName'])")
	private WebElement BusinessName;
	
	@FindBy(xpath="(//input[@id='EIN'])")
	private WebElement EIN;
	
	@FindBy(xpath="(//input[@id='ConfirmEIN'])")
	private WebElement ConfirmEIN;
	
	@FindBy(xpath="(//label[@class='css-label '])")
	private WebElement checkbox;
	
	@FindBy(xpath="(//input[@id='Address1'])")
	private WebElement Address1;
	
	@FindBy(xpath="(//input[@id='Address2'])")
	private WebElement Address2;
	
	@FindBy(xpath="(//input[@id='City'])")
	private WebElement City;
	
	@FindBy(xpath="(//input[@id='State'])")
	private WebElement State;
	
	@FindBy(xpath="/html/body/div[4]/div[6]/form/div/div[1]/div[7]/div[2]/table/tbody/tr[5]/td[3]/select/option[6]")
	private WebElement MyCountries;
	
	@FindBy(xpath="(//input[@id='txtzip'])")
	private WebElement txtzip;
	
	@FindBy(xpath="(//input[@id='SAName'])")
	private WebElement SAName;
	
	@FindBy(xpath="(//input[@id='SATitle'])")
	private WebElement SATitle;
	
	@FindBy(xpath="(//input[@id='SADayTimePhone'])")
	private WebElement SADayTimePhone;
	
	
	
	@FindBy(xpath="(//input[@id='btnNext'])")
	private WebElement btnNext;
	
	
	public BusinessDetailsProfile (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void is_BusinessName1() throws IOException {
		expliciteWait(driver, BusinessName );
		BusinessName.sendKeys("SPAN Technology(PND)");
	}
	
	public void is_EIN2 () throws IOException {
		expliciteWait(driver, EIN );
		EIN.sendKeys("77-9860016");
	}
	public void is_ConfirmEIN3 () throws IOException {
		expliciteWait(driver,ConfirmEIN );
		ConfirmEIN.sendKeys("77-9860016");
	}
	
	public void is_checkbox4 () throws IOException {
		expliciteWait(driver,checkbox );
		checkbox.click();
	}
	
	
	public void is_Address15 () throws IOException {
		expliciteWait(driver, Address1 );
		Address1.sendKeys("Pune");
	}
	
	public void is_Address26 () throws IOException {
		expliciteWait(driver, Address2 );
		Address2.sendKeys("Pune");
	}

	public void is_City7() throws IOException {
		expliciteWait(driver, City );
		City.sendKeys("Pune");
	}
	
	public void is_State8() throws IOException {
		expliciteWait(driver, State );
		State.sendKeys("Maharashtra");
		
	}
	
	public void is_MyCountries9 () throws IOException, InterruptedException {
		expliciteWait(driver, MyCountries );
		MyCountries.click();
	
	}
	
	public void is_txtzip10() throws IOException {
		expliciteWait(driver, txtzip );
		txtzip.sendKeys("411003");
	}
	
	public void is_SAName11() throws IOException {
		expliciteWait(driver, SAName );
		SAName.sendKeys("Pramod");
	}
	
	public void is_SATitle12() throws IOException {
		expliciteWait(driver, SATitle );
		SATitle.sendKeys("Software Test Engineer");
	}
	
	public void is_SADayTimePhone13() throws IOException {
		expliciteWait(driver, SADayTimePhone );
		SADayTimePhone.sendKeys("7798600164");
	}
	
	public void is_btnNext14() throws IOException, InterruptedException {
	
	JavascriptExecutor js = (JavascriptExecutor)driver ;
	js.executeScript("window.scrollBy(100,1000)");
	WebElement element = expliciteWait(driver,btnNext);
	js.executeScript("arguments[0].scrollIntoView(true)",btnNext);
	btnNext.click();
		
	}
	
}

