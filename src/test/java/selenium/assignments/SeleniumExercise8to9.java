package selenium.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class SeleniumExercise8to9 {

	/**
	 * Exercise 8 to 9
	 */
	public WebDriver driver;
	

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");

		String user = "Admin";
		String pass = "admin123";

		LoginPage loginP = new LoginPage(driver);

		loginP.setUsername(user);
		loginP.setPassword(pass);
		loginP.clickLoginButton();

	}

	@Test(dataProvider = "dataP")
	public void exerc8to99(String option) {

		/*
		 * 8- Write Test method and page title for different menus- in order(Admin, PIM,
		 * Leave Dashboard, Directory and Maintenance)
		 */
		NavBarPage navBarP = new NavBarPage(driver);
		navBarP.clickOnOption(option);

		List<String> valuesLst = driver.findElements(By.cssSelector("#mainMenu li.current > ul >li")).stream()
				.map(we -> we.getText()).collect(Collectors.toList());

		System.out.println("Suboptions for " + option + " page:");
		System.out.println(valuesLst);

		minimizeWindow();

	}

	@DataProvider
	public Object[][] dataP() {
		return new Object[][] { { "Admin" }, { "PIM" }, { "Leave" }, { "Dashboard" }, { "Directory" },
				{ "Maintenance" } };
	}

	@AfterClass
	public void tear() {
		driver.quit();
	}

	private void minimizeWindow() {
		// 9- Write a method (avoid using Test annotation) to minimize the window.
		// This method is only available in Selenium 4 beta, but I was having issues
		// running the Chrome driver in that version so I use 3.141.59 instead
		// driver.manage().window().minimize();
	}

}
