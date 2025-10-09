package parameter.dataProvider;

public class CustomDataProvider {


    @org.testng.annotations.DataProvider
    public Object[][] getData(){
        Object[][] data ={
                {"abcd@gmail.com","abcd1234#"},
                {"xyz@gmail.com","xyz123#"},
                {"pqrs@gmail.com","pqrs1234#"},
                {"jkl@gmail.com","jkl123#"},
        };
        return data;

    }
}
