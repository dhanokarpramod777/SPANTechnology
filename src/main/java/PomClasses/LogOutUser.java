package PomClasses;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class LogOutUser extends UtilClass1{

	WebDriver driver ;
	
	@FindBy(xpath="(//span[@class='user-letter'])[1]")
	private WebElement ProfileButton;
	

	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div[2]/div/nav/div[1]/div[2]/ul/li[3]/div/ul/li[3]/a")
	private WebElement LogOutButton;
	
	@FindBy(xpath="(//input[@id='LogOffAndSubmit'])")
	private WebElement SubmitLogOutButton;
	
	@FindBy(xpath="(//a[text()='Click Here'])")
	private WebElement PleaseClickHere;
	
	
	

	public LogOutUser (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
			
	public void is_ProfileButton1() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(100,1000)");
		
		WebElement element = expliciteWait(driver,ProfileButton);

		js.executeScript("arguments[0].scrollIntoView(true)",ProfileButton);
		ProfileButton.click();
	}	
	
	public void is_LogOutButton2 () throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		WebElement element = expliciteWait(driver,LogOutButton);

		js.executeScript("arguments[0].scrollIntoView(true)",LogOutButton);
		LogOutButton.click();
	}	
	
    public void is_SubmitLogOutButton3 () throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		WebElement element = expliciteWait(driver,SubmitLogOutButton);

		js.executeScript("arguments[0].scrollIntoView(true)",SubmitLogOutButton);
		SubmitLogOutButton.click();
	}	
	

    public void is_PleaseClickHere4() {
    	
    	Actions act = new Actions(driver);
    	 act.click(PleaseClickHere).perform();
    	
    	//PleaseClickHere.clear();
    	

      }

	
	
}
