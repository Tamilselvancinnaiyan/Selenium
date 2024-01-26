package uistore;

import org.openqa.selenium.By;

public class RegisterUI {
    public static By reg = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	public static By gender = By.id("gender-male");
	public static By firstname = By.id("FirstName");
	public static By lastname = By.id("LastName");
	public static By email = By.id("Email");
	public static By pass = By.id("Password");
	public static By c_pass = By.id("ConfirmPassword");
	public static By reg_btn = By.xpath("//*[@id=\'register-button\']");
	public static By logout = By.partialLinkText("Log");

}