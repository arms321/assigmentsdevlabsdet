package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class Exercise17 {
	

	private WebDriver driver;
	
	@cucumber.api.java.Before("@Exercise17")
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String usr = "Admin";
		String pass = "admin123";

		LoginPage loginP = new LoginPage(driver);

		loginP.setUsername(usr);
		loginP.setPassword(pass);
		loginP.clickLoginButton();
	}
	
	@Given("Click on Admin Link")
	public void click_on_admin_link() {
		NavBarPage navbarP = new NavBarPage(driver);
		navbarP.clickOnOption("Admin");
	}

	@Given("Click on Job")
	public void click_on_job() {
		HomePage homeP = new HomePage(driver);
		homeP.moveToJobTitle();
	}

	@Then("validate text Job Title")
	public void validate_text_job_title() {
		WebElement title = driver.findElement(By.xpath("//h1[contains(text(),'Job Titles')]"));
		assertEquals(title.getText(),"Job Titles");
	}

	@After("@Exercise17")
	public void tear() {
		driver.quit();
	}

}
