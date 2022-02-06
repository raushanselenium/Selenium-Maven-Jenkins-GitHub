package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoProgram {

    WebDriver driver;
    @Test
    public void demo_startBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        Assert.assertTrue(driver.getTitle().equals("Google"),"Page did not open");
        //driver.close();
    }


}
