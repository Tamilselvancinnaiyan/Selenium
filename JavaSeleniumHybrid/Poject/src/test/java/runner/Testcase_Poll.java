package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.LogManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import pages.Poll;
//import pages.Withdraw;
//import pages.homepage;
import utils.Screenshot;
import utils.Base;
import utils.EventHandler;
import utils.Reporter;
import utils.Screenshot;
public class Testcase_Poll extends Base {


    ExtentReports extent = new ExtentReports();
    Poll p;
@Test(priority = 2)
    public void TC_002() throws IOException {
        navigateToURL(driver, prop);
        p = new Poll(driver);  
        p.community_polls(driver); 
        
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



