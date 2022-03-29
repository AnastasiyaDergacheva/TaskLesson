package taskLesson5;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.Common;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    WebDriver driver;

    protected Common com = new Common();

    @BeforeTest
    public void beforeT() throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();

        //DesiredCapabilities dc = DesiredCapabilities.chrome();
        //dc.setCapability(ChromeOptions.CAPABILITY,op);
        //driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        FirefoxOptions ffo = new FirefoxOptions();

        //op.setCapability("version", "selenoid/chrome:98.0");
        //ffo.setCapability("version", "selenoid/firefox:98.0");

        URL hub = null;
        try {
            hub = new URL("http://localhost:4445/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new RemoteWebDriver(hub, ffo);
    }

    @AfterTest
    public void afterTest() {
        //getScreenShot();
        driver.quit(); //закрыть браузер
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    // @Attachment(value = "page screnshot", type = "image/png")
    public byte[] getScreenShot() { //получение скриншота
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
