package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
public WebDriver driver ;

public Logger logger ;
    @BeforeTest
   public void setUp()
    {
        logger = (Logger) LogManager.getLogger(this.getClass());
     driver=new EdgeDriver();
     driver.get("https://demo.opencart.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void tearDown()
    {

     driver.quit();

    }

    public String randomString(){
        return  RandomStringUtils.randomAlphabetic(10);
    }

    public String randomString2(){
        return  RandomStringUtils.randomNumeric(5);
    }


    public String randomAlphaNumeric()

    {
        String randomAlphaNumeric= RandomStringUtils.randomAlphabetic(5) ;
        String randomNUmber=RandomStringUtils.randomNumeric(10);
        return randomAlphaNumeric+randomNUmber;
    }


}
