package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import pages.Login;
import utils.Base;
import utils.Reporter;
public class Testcase_Login extends Base {

    
    ExtentReports extent = new ExtentReports();

    Login Homepage;
   
    
    @Test(priority = 1)
    public void TC_001() throws IOException { 
        
        navigateToURL1(driver, prop);
        Homepage = new Login(driver); // Provide the WebDriver instance here
        Homepage.Valid_Login_TC(driver);  

          
    }    

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        openBrowser();
        extent = Reporter.generateExtentReport();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        extent.flush();
    }
 }
