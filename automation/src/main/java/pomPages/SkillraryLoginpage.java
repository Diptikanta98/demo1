package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage {
	@FindBy(xpath="//a[text()= 'GEARS ']")
	
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()= 'SkillRary Demo APP'])[2]")
	
	private WebElement skillraryDemoapp;
	
	

	public void SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	public void gearsButton() {
		gerasbtn.click();
		
	}
public void SkillrarydemoApplication() {
	skillraryDemoapp.click();
	
}
}
