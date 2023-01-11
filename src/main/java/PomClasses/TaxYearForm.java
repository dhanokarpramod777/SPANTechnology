package PomClasses;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class TaxYearForm extends UtilClass1{
	
WebDriver driver ;

	
	@FindBy(xpath="/html/body/div[4]/div[6]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[3]/div[1]/label")
	private WebElement FiscalShortTaxYear;
	
	@FindBy(xpath="(//input[@id='TaxYearBeginDate'])")
	private WebElement TaxYearBeginDate;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])")
	private WebElement BeginDate;
	
	@FindBy(xpath="(//input[@id='TaxYearEndDate'])")
	private WebElement TaxYearEndDate;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])")
	private WebElement EndinDate;
	
	
	@FindBy(xpath="/html/body/div[4]/div[6]/form/div[1]/div[1]/div[2]/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div/label/span/div")
	private WebElement InitialReturn ;
	
	@FindBy(xpath="/html/body/div[4]/div[6]/form/div[1]/div[1]/div[2]/div[7]/div[2]/div[1]/div[2]/label")
	private WebElement Businescorporation ;
	
	@FindBy(xpath="(//input[@id='btnStep2Next'])")
	private WebElement NextButton;
	

	public TaxYearForm (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void is_FiscalShortTaxYear1() throws IOException {
		expliciteWait(driver, FiscalShortTaxYear );
		FiscalShortTaxYear.click();
	}
	

	public void is_TaxYearBeginDate2() throws IOException {
		expliciteWait(driver, TaxYearBeginDate );
		TaxYearBeginDate.click();
	}

	public void is_BeginDate3() throws IOException {
		expliciteWait(driver, BeginDate );
		BeginDate.click();
	}

	public void is_TaxYearEndDate4() throws IOException {
		expliciteWait(driver, TaxYearEndDate );
		TaxYearEndDate.click();
	}
	public void is_EndinDate5() throws IOException {
		expliciteWait(driver, EndinDate );
		EndinDate.click();
	}

	public void is_InitialReturn2() throws IOException {
		expliciteWait(driver, InitialReturn );
		InitialReturn.click();
	}
	
	public void is_Businescorporation3() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(100,1000)");
		
		WebElement element = expliciteWait(driver,Businescorporation);

		js.executeScript("arguments[0].scrollIntoView(true)",Businescorporation);
		Businescorporation.click();
	}
	
 public void is_NextButton4() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(100,1000)");
		
		WebElement element = expliciteWait(driver,NextButton);

		js.executeScript("arguments[0].scrollIntoView(true)",NextButton);
		NextButton.click();
	}
	
	
}
