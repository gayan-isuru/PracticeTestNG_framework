package calculatorTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testCalculator.ArithmaticOperation;

public class ArithmaticOperatorTest {

    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 0)
    public void testSum() {

    // HardAssertion

        System.out.println("<<<<<<<<<<<   test case for calculate Sum  >>>>>>>>>>>");
        System.out.println("<<<  First Sum Calculation  >>>");
        int actualSum1 = ArithmaticOperation.addCal(8,2);
        System.out.println("ActualSum1 value is : " + actualSum1);
        Assert.assertEquals(actualSum1,10,"failed to Calculate Sum");
        System.out.println("Calculation is pass");


        System.out.println("<<<<<<<<<<<   test case for calculate Sum  >>>>>>>>>>>");
        System.out.println("<<<  Second Sum Calculation  >>>");
        int actualSum2 = ArithmaticOperation.addCal(20,2);
        System.out.println("ActualSum1 value is : " + actualSum2);
        softAssert.assertEquals(actualSum2,22,"failed to Calculate Sum");


     //SoftAssertion
        System.out.println("<<<<<<<<<<<   test case for calculate Sum  >>>>>>>>>>>");
        System.out.println("<<<  Third Sum Calculation  >>>");
        int actualSum3 = ArithmaticOperation.addCal(30,5);
        System.out.println("ActualSum1 value is : " + actualSum3);
        softAssert.assertEquals(actualSum3,35,"failed to Calculate Sum");

        System.out.println();
        System.out.println();
        softAssert.assertAll();




    }


    @Test(priority = 1)
    public void testSub() {

        System.out.println(" <<<<<<<<    Run test case for calculate Sub   >>>>>>>>");
        System.out.println("<<<  First Sub Calculation  >>>");
        int actualSub1 = ArithmaticOperation.subCal(8,2);
        System.out.println("ActualSub1 value is : " + actualSub1);
        Assert.assertEquals(actualSub1,6,"failed to Calculate Sub");
        System.out.println("Calculation is pass");


        System.out.println(" <<<<<<<<    Run test case for calculate Sub   >>>>>>>>");
        System.out.println("<<<  Second Sub Calculation  >>>");
        int actualSub2 = ArithmaticOperation.subCal(25,2);
        System.out.println("ActualSub2 value is : " + actualSub2);
        Assert.assertEquals(actualSub2,23,"failed to Calculate Sub");
        System.out.println("Calculation is pass");




    }

}
