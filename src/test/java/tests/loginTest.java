package  tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import suite.SuiteManager;
import util.DriverManager;

import testdata.loginCredentials;

public class LoginTest extends SuiteManager {

       /* ConfigFileReader config = new ConfigFileReader();
        String username;
        String password;*/

        public BasePage basePage;
        public LoginPage loginPage;
        public HomePage homePage;
      /*  @BeforeTest
        public void login(){
                email = config.getProperty("username");
                passwrd = config.getProperty("password");

        }*/

        @Test(dataProvider = "loginCredentials", dataProviderClass = loginCredentials.class)
        public void LoginTest(String username, String password) {

                //String chromeDriverPath = System.getProperty("user.dir") + "/" + "src/main/resources/drivers/chromedriver";
                // DriverManager driverManager=new DriverManager();
                basePage = new BasePage();
                loginPage = basePage.clickLoginButton();
                homePage = loginPage.login(username,password);


               /* if (DriverManager.driver.findElement(By.id("link-to-login")).isEnabled()) {
                        System.out.println("User Navigated to Spree site");
                        DriverManager.driver.findElement(By.id("spree_user_email")).sendKeys(username);
                        DriverManager.driver.findElement(By.id("spree_user_password")).sendKeys(password);
                        DriverManager.driver.findElement(By.name("commit")).click();
                //} else{
                  //      System.out.println("Login site not existing");


                /*if(DriverManager.driver.findElement(By.linkText("Create a new account")).isDisplayed()) {
                        System.out.println("New Account creation");
                        DriverManager.driver.findElement(By.linkText("Create a new account")).click();
                        //driver.findElement(By.id("spree_user_email")).sendKeys(username);
                        //WebElement pwd1=driver.findElement(By.id("spree_user_password"));
                        //pwd1.sendKeys("New1234");
                        //WebElement Confirmpwd=driver.findElement(By.id("spree_user_password_confirmation"));
                        //Confirmpwd.sendKeys("New1234");
                } else {
                        System.out.println("New Account cannot be created");

                }*/

                DriverManager.driver.findElement(By.name("commit")).click();
                //if(driver.findElement(//class[contains(text(),"Logout")])
                System.out.println ("User Account Created");
                //else
                System.out.println("User Account not created");


        }

}
