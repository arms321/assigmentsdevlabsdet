package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIMPage {
	
	WebDriver driver;
	By employeeNameTxt = By.cssSelector("#empsearch_employee_name_empName");
	By serachBtn = By.cssSelector("#searchBtn");

	
	public PIMPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchByEmployeeName(String employee) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement searchBox =driver.findElement(employeeNameTxt);
		wait.until(ExpectedConditions.attributeContains(searchBox, "class", "ac_input inputFormatHint"));
		
		
		System.out.println("WEB ELEMENT: "+ searchBox);
		System.out.println("TEXT : "+ searchBox.getText());
		System.out.println("VALUE: "+ searchBox.getAttribute("value"));
		System.out.println("PLACEHOLDER: "+ searchBox.getAttribute("placeholder"));
		searchBox.sendKeys(employee);
	}
	
	public void clickSearch() {
		driver.findElement(serachBtn).click();
	}
	

}
