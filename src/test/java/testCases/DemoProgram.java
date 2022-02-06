package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoProgram {

    WebDriver driver;
    @Parameters("Browser")
    @Test
    public void demo_startBrowser(String browserName)
    {
        System.out.println("Parameter value is -> "+browserName);
        if(browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.google.co.in");
        Assert.assertTrue(driver.getTitle().equals("Google"),"Page did not open");
        //driver.close();
    }


}
