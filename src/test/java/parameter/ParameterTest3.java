package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest3 {

    @Test
    @Parameters("browser")
    public void browserExecution(String browser){
        System.out.println("Test Ng passed browser value is : "+browser);
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Test Ng passed browser value is : "+browser);
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Test Ng passed browser value is : "+browser);
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.out.println("Test Ng passed browser value is : "+browser);
        }
        else {
            System.out.println("Test Ng passed browser value is : "+browser);
        }
    }
}
