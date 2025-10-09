package calculatorTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testCalculator.ArithmaticOperation;

public class ArithmaticDataProvider{

    @Test(dataProvider = "CalculateData")
    public void calculateData(int num1,int num2,int expectedOut){
        Assert.assertEquals(ArithmaticOperation.addCal(num1,num2),expectedOut,"Add operation failed");
        System.out.println("Add operation successful: "+num1+" + "+num2+" = "+ ArithmaticOperation.addCal(num1,num2));


    }

    @DataProvider(name ="CalculateData")
    public Object[][] getData(){
        Object[][] data= {
                {1,2,3},
                {4,5,9},
                {5,8,13}

        };
        return data;
    };
}
