package scripts;

import org.testng.annotations.Test;

import genericlib.Baseclass;
import pomPages.SkillraryLoginpage;
import pomPages.skillrarydemologin;

public class Addtocart extends Baseclass{
	@Test
	public void tc1() {
		
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.gearsButton();
		s.SkillrarydemoApplication();
		utilies.switchTabs(driver);
		skillrarydemologin d=new skillrarydemologin(driver);
		utilies.mouseHober(driver,( d).getCoursebtn());
		
		
	}

}
