package selenium.assignments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class SeleniumExercise6to7 {

	
	/**
	 * exercise 6 to 7
	 */
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		//6- Launch a browser in @Beforesuite annotation and open url.
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	}
	
	
	@Test(priority = 1)
	public void exer6to7() {
		
		//7- Login to application again in @Test method, set priority 1 of the same method Afterlogging
		String usr = "Admin";
		String pass = "admin123";
		
		LoginPage loginP = new LoginPage(driver);
		
		loginP.setUsername(usr);
		loginP.setPassword(pass);
		loginP.clickLoginButton();
		
		}
	
	@AfterSuite
	public void tear() {
		driver.quit();
	}

}
