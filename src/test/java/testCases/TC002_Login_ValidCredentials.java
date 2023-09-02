package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrangeHRM_HomePage;

public class TC002_Login_ValidCredentials extends BaseClass{

    // Create the object of Home page

   // in java action methods and webElements are access by the help of Object

    // Object of the home page

  @Test

    public void verifyLoginWithValidCredentials(){

//      HomePage hp = new HomePage(driver);
//      hp.clickMyAccount();
//      hp.clickLoginButton();

      // Enter Email id


    LoginPage lp = new LoginPage(driver);
    lp.setUserName("Admin");
    lp.setPassword("admin123");
    lp.clickOnContinueButton();

    // Assertion to check if user has been logged in successfully into the application

    OrangeHRM_HomePage orp = new OrangeHRM_HomePage(driver);
    String actualUserName =orp.getUserName();
    String expectedUserName ="Ramlal Thakur";

    Assert.assertEquals(actualUserName,expectedUserName);
  }

}
