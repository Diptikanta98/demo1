package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	
	public WebDriver driver;
	public propertyfile pdata=new propertyfile();
	public webdriverutilies utilies =new webdriverutilies();
	
	@BeforeMethod

	public void openApp() throws FileNotFoundException,IOException {
		
	
		driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get(pdata.getData("url"));
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@AfterMethod

	public void closeApp(ITestResult res)throws IOException  {

		int status = res.getStatus();

		String name = res.getName();

		if(status==2) {
	
			screenshot s=new screenshot();
	
			 s.getPhoto(driver, name);
	
	
		driver.quit();
	
}

}
