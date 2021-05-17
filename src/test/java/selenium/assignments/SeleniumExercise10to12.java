package selenium.assignments;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

/*
 * 11- Implement ITestListener for above scenario where full-page screenshot needs to be capture where ever test is pass or failed
 */
@Listeners(listeners.ListenerExercise11.class)
public class SeleniumExercise10to12 {

	/**
	 * Exercise 10 to 12
	 */
	public WebDriver driver;

	@BeforeClass
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");

		String usr = "Admin";
		String pass = "admin123";

		LoginPage loginP = new LoginPage(driver);

		loginP.setUsername(usr);
		loginP.setPassword(pass);
		loginP.clickLoginButton();
	}

	/*
	 * 12- Implement Retry analyzer – retry 3 times only for the above scenario.
	 */

	@Test(retryAnalyzer = listeners.ListenerExercise12.class)
	public void exer10to12() {

		/*
		 * 10- Read Dashboard heading using [driver.findelement(by.xpath()).gettext()].
		 */

		String dashboardTxt = driver.findElement(By.xpath("//div[@id='content']//div[@class='head']/h1")).getText();
		assertEquals("Dashoard", dashboardTxt); // change text to equals text dashboard, right now is incorrect

	}

	@AfterClass
	public void tear() {
		driver.quit();
	}

}
