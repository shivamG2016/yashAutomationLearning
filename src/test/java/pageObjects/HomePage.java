package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement lnkMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement btnLogin;

    @FindBy(xpath ="//a[normalize-space()='Register']")
    WebElement lnkRegister;

    // Actions methods

    public void clickMyAccount(){

        lnkMyAccount.click();
    }


    public void clickLoginButton(){
        btnLogin.click();

    }
    public void clickRegister(){
        lnkRegister.click();
    }
}
