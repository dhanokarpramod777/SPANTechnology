package PomClasses;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class FilingFeesForm7004 extends UtilClass1{
WebDriver driver ;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement btnNextFFF7;

	public FilingFeesForm7004 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
			
	public void is_StepNextfff7() throws IOException {
		
			JavascriptExecutor js = (JavascriptExecutor)driver ;
			js.executeScript("window.scrollBy(100,1000)");
			
			WebElement element = expliciteWait(driver,btnNextFFF7);

			js.executeScript("arguments[0].scrollIntoView(true)",btnNextFFF7);
			btnNextFFF7.click();		
	}	

}
