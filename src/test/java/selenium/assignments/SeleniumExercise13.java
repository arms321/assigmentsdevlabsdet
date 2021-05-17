package selenium.assignments;

import static org.junit.Assert.assertNotNull;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import pageobjects.LoginPage;
import pageobjects.NavBarPage;
import pageobjects.PIMPage;

public class SeleniumExercise13 {

	
	/**
	 * Exercise 13
	 */
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {

		// Set up
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void exer13() throws InterruptedException {
		
		/*
		 * 13- Execute following scenario
		 */
	
		//• Login to OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com");
		String usr = "Admin";
		String pass = "admin123";
		
		LoginPage login = new LoginPage(driver);
		
		login.setUsername(usr);
		login.setPassword(pass);
		login.clickLoginButton();
		
		//• Click on PIM
		NavBarPage navbarP = new NavBarPage(driver);
		navbarP.clickOnOption("PIM");
		
		//• Enter Employee Name-Linda Anderson in Search box
		PIMPage pimP = new PIMPage(driver);
		
		pimP.searchByEmployeeName("Linda Jane Anderson");
		pimP.clickSearch();
		
		//• Validate and capture screenshot
		WebElement tb = driver.findElement(By.linkText("Linda Jane"));
		assertNotNull(tb);
		
		Shutterbug.shootPage(driver).withName("Exer12").save();
	
		}
	
	@AfterClass
	public void tear() {
		driver.quit();
	}

}
