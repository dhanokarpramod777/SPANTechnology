package PomClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClasses.UtilClass1;

public class PaymentPage extends UtilClass1{
	
	WebDriver driver ;
	
	@FindBy(xpath="(//div[@class='card-header'])")
	private WebElement cardheader;

	
	public PaymentPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean is_cardheaderVisiable() throws IOException {
		
		try {
			expliciteWait(driver,cardheader); 
			return true ;
			}
			catch(Exception e ) {
				e.printStackTrace();
				return false;
		        }
			}
	}	
	
	
	



