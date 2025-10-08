package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {

    @Test
    @Parameters({"val1","val2"})
    public void CalSum(int num1, int num2){
        int finalTotal = num1 + num2;
        System.out.println("number1 ="+num1+"\nnumber2 ="+num2+"\n\nFinal total is : "+finalTotal);
    }
}
