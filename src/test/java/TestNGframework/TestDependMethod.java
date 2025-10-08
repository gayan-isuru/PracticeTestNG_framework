package TestNGframework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependMethod {

    private static final Logger log = LoggerFactory.getLogger(TestDependMethod.class);

    @Test()
    public void oLevel(){
        System.out.println("test o/Level");
        //Assert.fail();
    }
    @Test(dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("test a/Level");

    }

    @Test(dependsOnMethods = {"oLevel","aLevel"},alwaysRun = true)
    public void campus(){
        System.out.println("test campus");
    }
}
