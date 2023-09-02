package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testCases.BaseClass;

public class OrangeHRM_HomePage extends BasePage {


    public OrangeHRM_HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//p[@class ='oxd-userdropdown-name']" )
    WebElement txtUserName;

    public String getUserName(){

        return txtUserName.getText();
    }
}
