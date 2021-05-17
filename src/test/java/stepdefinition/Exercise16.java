package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class Exercise16 {
	

	private WebDriver driver;
	
	@Before("@Exercise16")
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("I am in OrangeHRP Application")
	public void i_am_in_orange_hrp_application() {
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("Login to Application")
	public void login_to_application() {
		String usr = "Admin";
		String pass = "admin123";

		LoginPage loginP = new LoginPage(driver);

		loginP.setUsername(usr);
		loginP.setPassword(pass);
		loginP.clickLoginButton();
	}

	@When("Dashboard page is available")
	public void dashboard_page_is_available() {
		WebElement dashboard = driver.findElement(By.cssSelector("#mainMenu li.current"));
		assertEquals("Dashboard",dashboard.getText());
	}

	@Then("Click on Admin menu")
	public void click_on_admin_menu() {
		NavBarPage navbarP = new NavBarPage(driver);
		navbarP.clickOnOption("Admin");
	}
	
	@After("@Exercise16")
	public void tear() {
		driver.quit();
	}

}
