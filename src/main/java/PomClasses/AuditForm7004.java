package PomClasses;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class AuditForm7004 extends UtilClass1{
WebDriver driver ;
	
	@FindBy(xpath="//button[@type='button'][2]")
	
	private WebElement btnNxtAF7;

	public AuditForm7004 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
			
	public void is_StepNextAF7() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
	js.executeScript("window.scrollBy(100,1000)");
	WebElement element = expliciteWait(driver,btnNxtAF7);
	js.executeScript("arguments[0].scrollIntoView(true)",btnNxtAF7);
	btnNxtAF7.click();	
		
	}
}