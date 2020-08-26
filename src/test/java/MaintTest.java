import CssSelectors.LoginPageSelectors;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaintTest extends ChromeRunner {
    static LoginPageSelectors loginPageSelectors = new LoginPageSelectors();
    CommonClass common = new CommonClass();

    @Test
    public void Login() throws InterruptedException {
        //Xpath ცუდია ID-ები სჯობს მარა არ გამოვიდა  არ მუშაობდა ამიტომ ავიღე
        //  Thread.sleep -იც ცუდია მარა რო გავუშვი რამოდენიმჯერ იმუშავა,ვერ ასწრებს სახელის ჩაწერას
        common.waitUntilByXpathsentkey(driver, loginPageSelectors.UserName, "qa_3")
                .waitUntilByXpathsentkey(driver, loginPageSelectors.Password, "Testing");
        driver.findElement(By.xpath(loginPageSelectors.LoginButton)).click();
        Thread.sleep(3000);
        String Actualtext = driver.findElement(By.xpath(loginPageSelectors.MYid)).getText();
        Assert.assertEquals(Actualtext, "4837143");

    }

}
