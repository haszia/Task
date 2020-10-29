package application.Page;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class WwHomePage{
	WebDriver driver;
    public WwHomePage(WebDriver driver) {
    	this.driver=driver;
    }
    	@FindBy(how=How.XPATH, using="//ul//li//a[contains(@da-label,'Find a Workshop')]/span[starts-with(@class,'MenuItem')]") WebElement findWorkShop;
    	@FindBy(how=How.XPATH, using="//div//input[contains(@id,'location-search')]") WebElement searchBox;
    	@FindBy(how=How.XPATH, using="//div/button[contains(@aria-label,'Submit')]") WebElement clickSearch;
    	@FindBy(how=How.XPATH, using="//div[contains(@id,'search-results')]") WebElement searchResult;
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'search-results')]/div[1]")WebElement clickFirstResult;
	@FindBy(how = How.XPATH, using = "*//div/span[text()='WED']")WebElement printHours;

	
    public void clickOnfindWorkShop() {
    	findWorkShop.click();
    	
    }
    public void setZipCode(String strPinCode) {
    	searchBox.sendKeys(strPinCode);
    }
    public void clickSearch() {
    	clickSearch.click();
    }
    public void result() {
    	searchResult.getText();
    }
    public void firstResult() {
    	clickFirstResult.getText();
    }
		public void hoursPrint() {
			printHours.getText();
			
		}

}

