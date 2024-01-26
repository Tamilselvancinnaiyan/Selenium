
// package pages;

// import java.io.IOException;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;
// import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
// import utils.ReadPropertyFile;
// import utils.ExcelReader;
// import com.aventstack.extentreports.ExtentTest;
// import com.aventstack.extentreports.MediaEntityBuilder;
// import com.aventstack.extentreports.Status;



// import org.openqa.selenium.WebDriver;


// import utils.Screenshot;
// import utils.WebDriverHelper;
// import uistore.LoginUI;
// import utils.Reporter;


// public class Login{

//     private ExcelReader excelReader;    
//     private WebDriverHelper webDriverHelper;
  
//     ExcelReader file = new ExcelReader();
//     Reporter reporter = new Reporter();
//     ReadPropertyFile configReader = new ReadPropertyFile();
//     String browserName = configReader.getBrowserName(); 
//    //  private static final Logger logger = LogManager.getLogger(Login.class);
//     // static{
        
//     //     SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
//     //     System.setProperty("current.date.time", dateFormat.format(new Date()));
//     // }
//     public Login(WebDriver driver) {
//         webDriverHelper = new WebDriverHelper(driver);
//         excelReader = new ExcelReader();
      
//     }
//     public String ReadData(String SheetName, int RowNum, String ColumnName) throws IOException {
//         try {
//             return excelReader.ReadData("./testdata/Testdata.xlsx", SheetName, RowNum, ColumnName);
//         } catch (InvalidFormatException e) {
            
//             e.printStackTrace();
//             return null; 
//         }
//     }
    

//     public void Valid_Login_TC(WebDriver driver) throws IOException {
//        // log.info(("qwert"));
       
//         String username =ReadData("Sheet1", 1, "name");
//         String password =ReadData("Sheet1", 1, "password");
//         ExtentTest test = Reporter.generateExtentReport().createTest("Login Test", "Execution for Login Function");

//         try {
//             test.log(Status.PASS, "Browser opened");

//             try {
//                 webDriverHelper.fillForm(LoginUI.uname, username);
//                 Screenshot.getScreenShot(driver, "Login sucessfull");
//                 test.log(Status.PASS, "Enter Username");
//                // logger.info("Username Entered");
               
//             } catch (Exception ex) {
//                 ex.printStackTrace();
//                 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "UsernameEntryError");
//                 test.fail("Failed to Enter Username", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//             }


//             try {
//                 webDriverHelper.fillForm(LoginUI.pwd, password);
//                 test.log(Status.PASS, "Enter Password");
//               // logger.info("Password Entered");
//             } catch (Exception ex) {
//                 ex.printStackTrace();
//                 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "PasswordEntryError");
//                 test.fail("Failed to Enter Password", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//             }

//             // Click on submit
//             try {
//                 // driver.findElement(Locators1.submit).click();
//                 webDriverHelper.clickElement(LoginUI.login);
//                 test.log(Status.PASS, "Click on submit");
//               // logger.info("Login Button Clicked");
//             } catch (Exception ex) {
//                 ex.printStackTrace();
//                 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Error");
//                 test.fail("Failed to submit", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//             }

//         } catch (Exception ex) {
//             ex.printStackTrace();
//             String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Valid_Login_TC");
//             test.fail("Failed to Perform Valid_Login_TC", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//         }
//     }
// }

package pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import utils.ReadPropertyFile;
import utils.ExcelReader;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import utils.Screenshot;
import utils.WebDriverHelper;
import java.util.Date;
import uistore.LoginUI;
import utils.Reporter;

public class Login {

    private final static Logger logger = Logger.getLogger(Login.class);
    private ExcelReader excelReader;    
    private WebDriverHelper webDriverHelper;
    ExcelReader file = new ExcelReader();
    Reporter reporter = new Reporter();
    ReadPropertyFile configReader = new ReadPropertyFile();
    String browserName = configReader.getBrowserName(); 
 static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }


    public Login(WebDriver driver) {
        webDriverHelper = new WebDriverHelper(driver);
        excelReader = new ExcelReader();
        logger.info("Login_Page opened");
        

    }


    public void Valid_Login_TC(WebDriver driver) throws IOException {
        logger.info(("Started the page"));
        logger.info(browserName);
       

        ExtentTest test = Reporter.generateExtentReport().createTest("Login Test", "Execution for Login Function");

        try {
             test.log(Status.PASS, "Browser opened");
             String username =excelReader.ReadData("./testdata/Testdata.xlsx","Sheet1", 1, "name");
             String password =excelReader.ReadData("./testdata/Testdata.xlsx","Sheet1", 1, "password");

            try {
                webDriverHelper.fillForm(LoginUI.uname, username);
                Screenshot.getScreenShot(driver, "Login sucessfull");
                test.log(Status.PASS, "Enter Username");
               logger.info(("Entered Username"));
               
                // All levels of logs start 
                
                
                logger.info("My Info Log");
                logger.warn("My Warn Log");
                logger.error("My error log");
                logger.fatal("My fatal log");
                logger.debug("debug message");
                logger.trace("Trace message");
               
                 
                //All levels of logs start 

            } catch (Exception ex) {
                ex.printStackTrace();
                String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "UsernameEntryError");
                test.fail("Failed to Enter Username", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }


            try {
                webDriverHelper.fillForm(LoginUI.pwd, password);
                test.log(Status.PASS, "Enter Password");
                logger.info(("Entered Password"));
            } catch (Exception ex) {
                ex.printStackTrace();
                String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "PasswordEntryError");
                test.fail("Failed to Enter Password", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }

            // Click on submit
            try {
                // driver.findElement(Locators1.submit).click();
                webDriverHelper.clickElement(LoginUI.login);
                test.log(Status.PASS, "Click on submit");
                logger.info(("Clicked on submit button"));
            } catch (Exception ex) {
                ex.printStackTrace();
                String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Error");
                test.fail("Failed to submit", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Valid_Login_TC");
            test.fail("Failed to Perform Valid_Login_TC", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        }
    }
}
