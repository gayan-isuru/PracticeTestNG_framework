package TestNGframework;

import org.testng.annotations.Test;

public class TestPriority01 {

    @Test(priority = 0)
    public void testLogin(){
        System.out.println("test Login");
    }

    @Test(priority = 1)
    public void testCreate(){
        System.out.println("test Create");
    }

    @Test(priority = 2,enabled = false)     //By default enabled = true "We can skip this test case "
    public void testEdit(){
        System.out.println("test Edit");
    }

    @Test(priority = 3)
    public void testDelete(){
        System.out.println("test Delete");
    }

    @Test(priority = 4)
    public void testLogOut(){
        System.out.println("test LogOut");
    }
}
