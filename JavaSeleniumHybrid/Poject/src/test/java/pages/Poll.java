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
import utils.WebDriverHelper;
import uistore.PollUI;
import utils.Reporter;

public class Poll  {


    private WebDriverHelper webDriverHelper;


   // private static final Logger logger = LogManager.getLogger(Poll.class);
    // static{
        
    //     SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
    //     System.setProperty("current.date.time", dateFormat.format(new Date()));
    // }
   
    Reporter reporter = new Reporter();
    public Poll(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        
    }  

    public void community_polls(WebDriver driver)throws IOException {
    
           
            ExtentTest test = Reporter.generateExtentReport().createTest("Poll Test", "Execution for Poll  Function");
              
        try{
        
            try{
            
            webDriverHelper.clickElement(PollUI.poll_ans);
            test.log(Status.PASS, "Click on the Poll ans");
           // logger.info("Poll answer clicked");
            
            }
            catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in poll ans");
            test.fail("Failed to Perform  poll ans", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
       
        try{
             webDriverHelper.clickElement(PollUI.votepoll);
            test.log(Status.PASS, "Click on the Vote poll");
            //logger.info("Vote poll clicked");
                // All levels of logs start 
        


        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in vote poll");
            test.fail("Failed to Perform  vote poll", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }      
        
        }catch(Exception ex){
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Deposit Test");
            test.fail("Failed to Perform Deposit Test", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     
        }
           
        
    }
}