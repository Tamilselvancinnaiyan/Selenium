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

import pages.Register;
import utils.Screenshot;
import utils.Base;
import utils.EventHandler;
import utils.Reporter;
import utils.Screenshot;
public class Testcase_Register extends Base {

   
    ExtentReports extent = new ExtentReports();
    Register r;


    @Test(priority = 3)
    public void TC_003() throws IOException {
        
            navigateToURL(driver, prop);
            r = new Register(driver);
            r.register_page(driver);
            
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

