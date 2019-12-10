package pages;

import org.openqa.selenium.support.PageFactory;
import util.DriverManager;
import suite.SuiteManager;

public class HomePage extends SuiteManager{

    public HomePage(){
        PageFactory.initElements(DriverManager.driver,this);
    }

}

