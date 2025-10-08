package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

    SoftAssert softAssert = new SoftAssert();

    //create actualValue
    String actualValue = "Colombo";


    //01 check values are equals
    @Test(priority = 0)
    public void testAssert1() {
        String expectedValue = "Colomb";
        System.out.println("check values are Equal");
        softAssert.assertEquals(actualValue, expectedValue, "Values miss match");
        System.out.println("After values equalCheck Assertion");
        softAssert.assertAll();   // get exception
    }

    //02 check values are not equals
    @Test(priority = 1)
    public void testAssert2() {
        String expectedValue = "Kandy";
        System.out.println("check values are Equal or Not");
        softAssert.assertNotEquals(actualValue, expectedValue, "Values are match");
        System.out.println("After to valuesNotEqualCheck Assertion");

    }

    @Test(priority = 2)
    public void testAssertTrue() {
        boolean expectedValue = true;
        System.out.println("check values condition Is True");
        softAssert.assertTrue(actualValue.startsWith("C"),"Condition returns a false value");
        System.out.println("After to checkCondition Assertion");
    }

    @Test(priority = 3)
    public void testAssertFalse() {
        System.out.println("Check Condition is False");
        softAssert.assertFalse(actualValue.isBlank(),"Condition returns a True value");
        System.out.println("After to checkCondition Assertion");

    }

}
