import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonClass {
    public CommonClass waitUntilByXpath(WebDriver browser, String element) {

        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        browser.findElement(By.xpath(element)).click();
        return this;
    }

    public CommonClass waitUntilByXpathsentkey(WebDriver browser, String element, String SendString) {

        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        browser.findElement(By.xpath(element)).sendKeys(SendString);
        return this;
    }

    public CommonClass GetText(WebDriver browser, String element) {

        WebDriverWait wait = new WebDriverWait(browser, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
        browser.findElement(By.id(element)).getText();
        return this;
    }

    public CommonClass doubleClick(String element, WebDriver browser) {
        Actions a = new Actions(browser);
        a.moveToElement(browser.findElement(By.xpath(element))).
                doubleClick().build().perform();
        return this;
    }


}
