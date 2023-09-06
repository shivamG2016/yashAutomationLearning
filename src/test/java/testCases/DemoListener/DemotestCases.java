package testCases.DemoListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilities.ExtentReportManager.class)
public class DemotestCases {


@Test(priority = 1)
    public void testCase1(){

    System.out.println("I am in first Test case1 ");
}

    @Test(priority = 2)
    public void testCase2(){

        System.out.println("I am in first Test case2 ");
    }

    @Test(priority = 3)
    public void testCase3(){
        Assert.fail();
        System.out.println("I am in first Test case3 ");
    }

    @Test(priority = 4,dependsOnMethods = "testCase3")
    public void testCase4(){

        System.out.println("I am in first Test case4 ");
    }
}
