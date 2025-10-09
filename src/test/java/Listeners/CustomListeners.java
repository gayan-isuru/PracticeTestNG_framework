package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGListeners.class)
public class CustomListeners {

    @Test
    public void testMethod1(){
        System.out.println("testMethod1");
    }
    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
    }
    @Test
    public void testMethod3(){
        System.out.println("testMethod3");

    }
    @Test
    public void testMethod4(){
        System.out.println("testMethod4");
    }
}
