package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private WebDriver driver;

    protected final int driverWaitTime = 10;

    public Base(final WebDriver driver) { //
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void click(final WebElement element) { //клик по элементу
        waitVisibilityElement(element);
        element.click(); //кликнули по нему когда станет видимым
    }

    public void setText(final WebElement element, final String text) {
        waitVisibilityElement(element);
        element.sendKeys(text); //
    }

    public String getText(final WebElement element) {
        waitVisibilityElement(element);
        return element.getText();
    }

    public Boolean waitVisibilityElement(final WebElement element) { //ожидание
        // получает на вход драйвер и ждет 3 секунды до появления элемента
        WebDriverWait wait = new WebDriverWait(driver, driverWaitTime);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean waitVisibilityElement(final WebElement element, final int sec) { //перегрузка метода
        WebDriverWait wait = new WebDriverWait(driver, sec);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}