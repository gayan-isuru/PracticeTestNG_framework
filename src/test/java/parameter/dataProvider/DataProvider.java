package parameter.dataProvider;

import org.testng.annotations.Test;

public class DataProvider {

    //using dataProvider and dataProviderClass ="classname.class
    //@Test(dataProvider = "getData")
    @Test(dataProvider = "getData",dataProviderClass = CustomDataProvider.class)
    public void testDataProvider(String email, String password){
        System.out.println(email+" "+password);

    }



//    @org.testng.annotations.DataProvider
//    public Object[][] getData(){
//        Object[][] data ={
//                {"abcd@gmail.com","abcd1234#"},
//                {"xyz@gmail.com","xyz123#"},
//                {"pqrs@gmail.com","pqrs1234#"},
//                {"jkl@gmail.com","jkl123#"},
//        };
//        return data;
//
//    }
}
