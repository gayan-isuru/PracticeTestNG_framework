package TestNGframework;

import org.testng.annotations.Test;

public class TestNGAnnotation1 {

    public static void main(String[] args) {
        System.out.println("TestNG Annotation1 ");
        TestNGAnnotation1 testNGAnnotation1 = new TestNGAnnotation1();
        testNGAnnotation1.test1();

    }


    public void test1(){
        System.out.println("Practice Non @Test method ");
    }

    @Test
    public void teatngMethod1(){
        System.out.println("Practice TestNG ");
    }
}
