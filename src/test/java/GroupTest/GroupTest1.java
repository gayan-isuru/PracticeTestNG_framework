package GroupTest;

import org.testng.annotations.Test;

public class GroupTest1 {

    // S = smoke      R = regression


    @Test(groups = {"S","R"})
    public void test1(){
        System.out.println("This is a Smoke and Regression test case");
    }

    @Test(groups = "S")
    public void test2(){
        System.out.println("This is a Smoke  test case");
    }

    @Test(groups = "R")
    public void test3(){
        System.out.println("This is a Regression test case");
    }
    @Test
    public void test4(){
        System.out.println("This is Not a Smoke or Regression test case");
    }
    @Test(groups = {"S","R"})
    public void test5(){
        System.out.println("This is a Smoke and Regression test case");
    }

}
