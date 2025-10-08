package Assertions;

import org.testng.annotations.Test;

public class TestAssertions {

    String name="Kamal Bandara";
 // usinv =
    @Test
    public void testAssert(){
        if(name.equals("Kamal Bandara")){
            System.out.println("name is match");
        }
        else {
            System.out.println("name is not match");
        }

    }
}
