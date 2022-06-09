package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // Driver annotation to perform before and after//

    public static WebDriver driver = null;

    @Before
    public static void openBrowser()
    {
        // Step 1 : Setting Step Definition
        String webdriverPath = System.getProperty("user.dir")+ "\\src\\main\\resources\\BrowserDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", webdriverPath);
        // Step 2 : Driver Object Creation
        driver = new ChromeDriver();
        // Step 3 : Config to Driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Step 4 : Navigation to Website Hopmepage
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
