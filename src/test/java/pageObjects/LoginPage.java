package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txtUserName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;


    // Actions methods

    public void setUserName(String emailId){

        txtUserName.sendKeys(emailId);
    }

    public void setPassword(String password){

        txtPassword.sendKeys(password);
    }

    public void clickOnContinueButton(){

        btnLogin.click();
    }

}
