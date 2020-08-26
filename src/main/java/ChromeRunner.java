import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;


public class ChromeRunner {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        new ChromeRunner().OpenChrome("https://www-gli.singulardev.uk/");
    }

    @AfterClass
    public static void closeDriver() {
        //  driver.quit();
    }

    public void OpenChrome(String Link) {


        WebDriverManager.getInstance(CHROME).setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--headless");
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(chromeOptions);

        driver.manage().deleteAllCookies();

        driver.get(Link);
    }
}