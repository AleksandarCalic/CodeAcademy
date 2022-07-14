package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    public WebDriver driver;
    public void setup(){
        System.setProperty("web driver.gecko.driver", "C:\\Users\\QA25\\Desktop\\TestProject\\TestProject\\lib");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After

    public void teardown(){
        driver.quit();  //driver=browser, da kazemo...
    }
    }
    
