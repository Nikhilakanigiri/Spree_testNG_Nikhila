import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void verifyLogin() {
        System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.id("link-to-login")).click();
        //String Email= "kanigirinikhila9@gmail.com";

        //if(driver.findElement(By.linkText("Create a new account")).isDisplayed())
//
        //          System.out.println("New Account creation");
        //    else
        //      System.out.println("New Account cannot be created");

        //driver.findElement(By.linkText("Create a new account")).click();
        //driver.findElement(By.id("spree_user_email")).sendKeys(Email);
        //WebElement pwd1=driver.findElement(By.id("spree_user_password"));
        //pwd1.sendKeys("New1234");
        //WebElement Confirmpwd=driver.findElement(By.id("spree_user_password_confirmation"));
        //Confirmpwd.sendKeys("New1234");

        //driver.findElement(By.name("commit")).click();
        //if(driver.findElement(//class[contains(text(),"Logout")])

        //      System.out.println ("User Account Created");
        //else
        //      System.out.println("User Account not created");
        //driver.close();

        }

    }

