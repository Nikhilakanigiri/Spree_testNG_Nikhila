package testdata;

import org.testng.annotations.DataProvider;

public class loginCredentials {
    @DataProvider(name="loginCredentials")
    public static Object[][] loginData(){
        return new Object[][] {
                {"kanigirinikhila9","New1234"}
        };
    }
}
