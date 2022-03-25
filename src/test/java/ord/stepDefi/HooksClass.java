package ord.stepDefi;

import java.util.concurrent.TimeUnit;

import org.BaseMethod.BaseClassMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends BaseClassMethod{

	@Before
	public void beforeScenario() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@After
	public void afterscenario(Scenario sc) {

		if (sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, sc.getName()+".png");

		}
	}
	
}
