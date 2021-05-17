package selenium.assignments;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class SeleniumExercise14to15 {

	/**
	 * Exercise 14 and 15
	 */

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		// Set up
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@SuppressWarnings("unused")
	@Test
	public void exer14to15() {
		
		String usr = "Admin";
		String pass = "admin123";

		LoginPage loginP = new LoginPage(driver);

		loginP.setUsername(usr);
		loginP.setPassword(pass);
		loginP.clickLoginButton();


		//14- Write CSS Selector of highlighted Rectangular object (in Red) in below Image

		String pimSelector = "#mainMenu #menu_pim_viewPimModule";
		String timeSelector = "#mainMenu #menu_time_viewTimeModule";
		String manteSelector = "#mainMenu #menu_maintenance_purgeEmployee";
		String assignLeaveSelector = ".quickLaungeContainer a[href*='assignLeave']";
		String timeSheetsSelector = ".quickLaungeContainer a[href*='viewEmployeeTimesheet']";
		String pieChartSelector = "#div_graph_display_emp_distribution";
		
		//15- Write Xpath Selector of highlighted Rectangular object (in Red) in below 
		
		String adminXpath = "//b[contains(text(),'Admin')]";
		String mktpXpath = "//input[@id='MP_link']";
		String welcomeXpath = "//a[@id='welcome']";
		String leaveListXpath = "//table[@class='quickLaungeContainer']//a[contains(@href,'viewLeaveList')]/parent::div";
		

	}

	@AfterClass
	public void tear() {
		driver.quit();
	}
}
