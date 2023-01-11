package PomClasses;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class SummaryForm  extends UtilClass1{
	
WebDriver driver ;
	
	@FindBy(xpath="(//input[@id='btnNext'])")
	private WebElement StepNext;

	public SummaryForm (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
			
	public void is_StepNext1() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(100,1000)");
		
		WebElement element = expliciteWait(driver,StepNext);

		js.executeScript("arguments[0].scrollIntoView(true)",StepNext);
		StepNext.click();
	}	

}
