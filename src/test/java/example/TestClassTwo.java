package example;

import org.testng.annotations.*;

public class TestClassTwo {

    @Parameters({"param1", "param2"})
    @Test
    public void testWithXmlParameters(
            @Optional("DefaultParam1") String param1,
            @Optional("DefaultParam2") String param2) {
        System.out.println("Parameters from testng.xml: " + param1 + ", " + param2);
    }


    @Test(dataProvider = "dataProviderMethod")
    public void testWithDataProvider(String param1, int param2) {
        System.out.println("Parameters from DataProvider: " + param1 + ", " + param2);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"First", 1},
                {"Second", 2},
                {"Third", 3}
        };
    }
}
