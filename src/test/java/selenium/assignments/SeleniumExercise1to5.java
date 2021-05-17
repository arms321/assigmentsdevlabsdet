package selenium.assignments;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class SeleniumExercise1to5 {

	public WebDriver driver;
	/**
	 * Exercise 1 to 5
	 */
	@SuppressWarnings("unused")
	@Test
	public void exer1to5() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// 1-Open the above URL in Chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com");

		// 2-Print the title of this application.
		String title = driver.getTitle();
		System.out.println("Title: " + title);

		// 3-Write Xpath and CssSelector of login page for following web objects - All
		// Text box’s, All - Hyperlinks, All Images.

		// Text box
		String xpathUserTxt = "//input[@id='txtUsername']";
		String xpathPassTxt = "//input[@id='txtPassword']";
		String cssUserTxt = "#txtUsername";
		String cssPassTxt = "#txtPassword";

		// Hyperlink
		String xpathFPass = "//a[contains(text(),'Forgot your password?')]";
		String xpathOHRM = "//a[contains(text(),'OrangeHRM, Inc')]";
		String cssFPass = "#forgotPasswordLink a";
		String cssOHRM = "#footer a";

		// Images
		String xpathMLogo = "//div[@id='divLogo']/img";
		String xpathSocialMedia = "//*[@id='social-icons']/a/img";
		String cssMLogo = "#divLogo img";
		String cssSocialMedia = "#social-icons a img";

		// 4- Login with given User Name and Password and validate Dashboard.
		String usr = "Admin";
		String pass = "admin123";

		LoginPage loginP = new LoginPage(driver);

		loginP.setUsername(usr);
		loginP.setPassword(pass);
		loginP.clickLoginButton();

		WebElement dashb = driver.findElement(By.cssSelector("#mainMenu li.current"));
		assertEquals("Dashboard", dashb.getText());

		/*
		 * 5- Click on Admin Link in Home Page and validate following text- • User
		 * Management • Job • Organization • Qualifications
		 */

		NavBarPage navbarP = new NavBarPage(driver);
		navbarP.clickOnOption("Admin");

		List<String> expectedValues = List.of("User Management", "Job", "Organization", "Qualifications");
		List<String> actualValues = driver.findElements(By.cssSelector("#mainMenu li.current > ul >li")).stream()
				.map(we -> we.getText()).collect(Collectors.toList());

		System.out.println("Actual Values: " + actualValues);
		expectedValues.forEach(i -> {
			System.out.println("Expected Value: " + i);
			assertTrue(actualValues.contains(i));
		});

		driver.quit();
	}

}
