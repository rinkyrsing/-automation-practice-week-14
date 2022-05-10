package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"","123456","An email address required."},
                {"acb@gmail.com","","Password is required."},
                {"acbil23","232e2e","Invalid email address."},
                {"acb@gmail.com","23rf34","Authentication failed."}
        };
        return data;
    }
    @DataProvider(name = "dataSet")
    public Object[][]  getData1() {
        Object[][] data = new Object[][] {
                {"Blouse","2","M","White"},
                {"Printed Dress","3","S","Orange"},
                {"Printed Chiffon Dress","4","S","Green"},
                {"Printed Summer Dress","2","M","Blue"}
        };
        return data;
    }

}
