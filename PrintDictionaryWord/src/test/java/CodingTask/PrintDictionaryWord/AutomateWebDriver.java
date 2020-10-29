package CodingTask.PrintDictionaryWord;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import application.Page.WwHomePage;
import before.ContextSettings;

public class AutomateWebDriver extends ContextSettings {

	@Test(description="Navigate to WeightWatchers and Print meetings for each person")
public void getData() throws Exception{
		Assert.assertEquals("WW (Weight Watchers): Weight Loss & Wellness Help | WW USA", "WW (Weight Watchers): Weight Loss & Wellness Help | WW USA");
	
	WwHomePage homePage = PageFactory.initElements(driver, WwHomePage.class);
	homePage.clickOnfindWorkShop();
	
homePage.setZipCode("10011");
homePage.clickSearch();
homePage.result();
String expected = driver.findElement(By.xpath("//div[contains(@id,'search-results')]/div/a")).getText();
homePage.firstResult();
String actual = driver.findElement(By.xpath("//div[contains(@id,'search-results')]/div/a")).getText();
Assert.assertEquals(expected, actual);

driver.findElement(By.xpath("//div[contains(@class,'linkContainer')]/a[@href='/us/find-a-workshop/1180510/ww-studio-flatiron-new-york-ny']")).click();
    String hours = driver.findElement(By.xpath("*//div[contains(@class,'workshopSchedule-2foP8')][2]//span[text()='THU']//ancestor::div[contains(@class,'day-NhBOb')]")).getText();
System.out.println(hours);
List<WebElement> elements = driver.findElements(By.xpath("*//div[contains(@class,'workshopSchedule-2foP8')][2]//span[text()='THU']//ancestor::div[contains(@class,'day-NhBOb')]"));
int count = elements.size();
	}
}