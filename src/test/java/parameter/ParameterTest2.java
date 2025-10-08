package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest2 {


    @Test
    @Parameters({"val1","val2"})
    public void CalSub(int num1, int num2){
        if(num1>num2){
            int finalTotal = num1 - num2;
            System.out.println("number1 ="+num1+"\nnumber2 ="+num2+"\n\nFinal total is : "+finalTotal);
        }
        else{
            int finalTotal = num2 - num1;
            System.out.println("\"Number2 - Number1 \"");
            System.out.println("number1 ="+num1+"\nnumber2 ="+num2+"\n\nFinal total is : "+finalTotal);
        }
    }
}
