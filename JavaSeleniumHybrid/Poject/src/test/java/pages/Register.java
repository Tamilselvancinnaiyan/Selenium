package pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.Screenshot;
import utils.WebDriverHelper;
import uistore.RegisterUI;
import utils.Reporter;

public class Register {

    private WebDriverHelper webDriverHelper;
    private static final Logger logger = LogManager.getLogger(Register.class);
    Reporter reporter = new Reporter();
    static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }
    
    public Register(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
       
    }
    


  public void register_page(WebDriver driver)throws IOException {
            
            ExtentTest test = Reporter.generateExtentReport().createTest("Withdraw Test", "Execution for WithdrawTest  Function");
try{
        try{
            Duration timeout = Duration.ofSeconds(10);
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            driver.findElement(RegisterUI.reg).click();
            test.log(Status.PASS, "Click on the Register link");
            logger.info("Click on the Register link");
        }
        catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Withdrea link");
            test.fail("Failed to Perform  Withdrea link", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
         try{
            
            driver.findElement(RegisterUI.gender).click();
            test.log(Status.PASS, "Click on the Gender link");
        }
        catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Gender");
            test.fail("Failed to Perform  Gender click", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
        try{
            webDriverHelper.fillForm(RegisterUI.firstname, "Priya");
                Screenshot.getScreenShot(driver, "Login sucessfull");
                test.log(Status.PASS, "Enter Username");
                logger.info("Firstname Entered");

        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in First name ");
            test.fail("Failed in Account type", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }try{
            webDriverHelper.fillForm(RegisterUI.lastname, "Yuvaraj");
             test.log(Status.PASS, "Enter the last name");
        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in lastname");
            test.fail("Failed in  lastname", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
        try{
            webDriverHelper.fillForm(RegisterUI.email, "priya@gmail.com");
             test.log(Status.PASS, "Enter the email");
        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in email");
            test.fail("Failed in email", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
        try{
            webDriverHelper.fillForm(RegisterUI.pass, "priya123");
             test.log(Status.PASS, "Enter the Password");
        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in password");
            test.fail("Failed in password", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
        try{
            webDriverHelper.fillForm(RegisterUI.c_pass, "priya123");
             test.log(Status.PASS, "Enter the Confirm password");
        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Confirm password");
            test.fail("Failed in Confirm password", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
        webDriverHelper.clickElement(RegisterUI.reg_btn);
        logger.info("Register button clicked");
        

    }
    catch(Exception ex){
        ex.printStackTrace();
        String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Registeration");
        test.fail("Failed to Register", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
 
    }
    }
}