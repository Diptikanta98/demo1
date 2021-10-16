package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type()=type=\'submit\'])[2]")
			
			private WebElement addtocartbtn ;
	public Addtocartpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void addtocartbutton() {
		addtocartbtn.click();
		
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	

}
