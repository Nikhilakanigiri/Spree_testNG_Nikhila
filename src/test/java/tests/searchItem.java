package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.DriverManager;
import util.ConfigFileReader;

import java.awt.*;

public class searchItem extends SuiteManager {
        //DriverManager driverManager = new DriverManager();
        ConfigFileReader config = new ConfigFileReader();
        String searchField;

        @BeforeTest
        public void searchPage(){
                System.out.println("Reading config");
                searchField = config.getProperty("searchField");
                System.out.println("Search Item:  "+searchField);
        }
        @Test
        public void searchItem() throws InterruptedException{
        DriverManager.driver.findElement(By.id("keywords")).sendKeys(searchField);
        DriverManager.driver.findElement(By.cssSelector("input[value='Search']")).submit();
        Thread.sleep(3000);
        System.out.println("User searched for Item");
        }

}
