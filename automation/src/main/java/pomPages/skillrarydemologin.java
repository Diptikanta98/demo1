package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarydemologin {
	
	@FindBy(id="course")
	
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()=\'Selenium Training\']")
	
	private WebElement seleniumtraining;
	
	public skillrarydemologin(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		public void coursetab() {
			coursebtn.click();
			
		}
		
		public void seleniumtariningbtn() {
			seleniumtraining.click();
			
			
		}
	

	
		
	
	
	

	
	
	

	

	}
	
	
	

}
