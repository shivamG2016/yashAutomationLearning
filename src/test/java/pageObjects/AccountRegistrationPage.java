package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
    public AccountRegistrationPage(WebDriver driver) {
        super(driver);

    }



    @FindBy(xpath ="//input[@id='input-firstname']")
    WebElement txtFirstName;
    @FindBy(xpath ="//input[@id='input-lastname']")
    WebElement txtLastName;

    @FindBy(xpath ="//input[@id='input-email']")
    WebElement txtEmailId;

    @FindBy(xpath ="//input[@id='input-password']")
    WebElement txtPassword;


    @FindBy(xpath ="//input[@name='agree']")
    WebElement chkPolicy;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement btnContinue;

    @FindBy(xpath ="//h1")
    WebElement msgConfirmationMessage;


 // driver.findbyElemt(By.xpath).sendKeys("text)

    // Action Methods for this page

    public void setFirstName(String fName){

        txtFirstName.sendKeys(fName);
    }

    public void setLastName(String lName){

        txtLastName.sendKeys(lName);
    }

    public void setEmailId(String emailId){
        txtEmailId.sendKeys(emailId);
    }

    public void setPassword(String password){

        txtPassword.sendKeys(password);
    }

    public void clickContinueButton(){

        btnContinue.click();
    }

    public void clickChkPolicy(){

        chkPolicy.click();
    }

    public String getConfirmationMessage(){
       return  msgConfirmationMessage.getText();

    }

}
