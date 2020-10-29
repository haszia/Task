package before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ContextSettings{ 
	
public static WebDriver driver = null;
 @BeforeClass
public void setupApplication() throws IOException{ 
	 
  Reporter.log("=====Browser Session Started=====", true);
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ziaki\\OneDrive\\Desktop\\Coding Task\\chromedriver.exe");
       driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  driver.get("http://weightwatchers.com/us/");
  String ActualTitle = driver.getTitle();
  Reporter.log("=====Application Started=====", true);
}

 @AfterClass
public void closeApplication()
{
  driver.quit();
  Reporter.log("=====Browser Session End=====", true);
}
}