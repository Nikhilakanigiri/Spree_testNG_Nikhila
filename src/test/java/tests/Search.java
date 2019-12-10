/*package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Search {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();*/
/*

        driver.findElement(By.id("keywords")).sendKeys(searchfield);
        //driver.findElement(By.id("inputTag")).getAttribute("value").compareTo("submit");
        //WebElement searchclick=driver.findElement(input.btn.btn-success);
        WebElement searchclick = driver.findElement(By.linkText("search"));
        searchclick.click();

        //List of all items
        /*List<WebElement> elementsList = driver.findElements(By.id("products"));
        System.out.println("List of elements");
        for (int i = 0; i < elementsList.size(); i++) {
            System.out.println("Products List:" + elementsList.get(i).getAttribute("id"));
        }

        //click on second item
        String productTitle=driver.findElement(By.className("info_mt-3_d-block")).getText();
        System.out.println("Name of Product selected displayed");
        driver.findElement(By.cssSelector("div[className='row_d-flex'][1]")).click();*/

        /* Add to CArt
        String selectproductTitle=driver.findElement(By.className("product-title mt-2")).getText();
        int orderQuantity=driver.findElement(By.id("quantity"));
        if((productTitle==selectproductTitle)==true)
            System.out.println("Product selected Matched");
        else
            System.out.println("Product selected not Matched");
        driver.findElement(By.id("add-to-cart-button")).click();

        //Checkout
        //String checkProductTitle=driver.get();
        int orderQuantity1=driver.findElement(By.id("order_line_items_attributes_0_quantity"));
        /*if((orderQuantity==orderQuantity1)>0)
            System.out.println("Order Matched in Checkout page");
        driver.findElement(By.id("checkout-link")).click();
        else
        System.out.println("Checkout quantity of the product mismatched");*/
        //driver.findElement(By.id("home-link")).click();
        //return false;


        //Verify Item




  //  }
//}
