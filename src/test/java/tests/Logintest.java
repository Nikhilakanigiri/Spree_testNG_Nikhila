import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.DriverManager;

import java.util.concurrent.TimeUnit;

public class Logintest extends SuiteManager {

        @Test
        public void logintest() {

                //String baseUrl = "https://spree-vapasi-prod.herokuapp.com/";
                String chromeDriverPath = System.getProperty("user.dir") + "/" + "src/main/resources/drivers/chromedriver";
                //String Email = "kanigirinikhila9@gmail.com";
                //String pwd="New1234";
               // DriverManager driverManager=new DriverManager();

                DriverManager.driver.findElement(By.id("link-to-login")).click();
                //String Email = "kanigirinikhila9@gmail.com";
                DriverManager.driver.findElement(By.id("spree_user_email")).sendKeys("kanigirinikhila9@gmail.com");
                DriverManager.driver.findElement(By.id("spree_user_password")).sendKeys("New1234");

                DriverManager.driver.findElement(By.name("commit")).click();

        }

}
