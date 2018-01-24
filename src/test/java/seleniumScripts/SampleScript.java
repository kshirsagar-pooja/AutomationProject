package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleScript {
	WebDriver driver;

	@Test
	public void runSampleScript() {
		System.setProperty("webdriver.chrome.driver",
				"C:/AutomationProject/AutomationProject/src/main/java/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.quit();
	}

}
