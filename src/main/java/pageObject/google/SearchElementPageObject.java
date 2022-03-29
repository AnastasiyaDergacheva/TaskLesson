package pageObject.google;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchElementPageObject extends Base {

    public SearchElementPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@id='stickyHeader']//div[@class='gc3']//a[contains(.,'Корзина')")
    private WebElement BasketButton;

    /**
     * Проверяем, что кнопка Корзина существует на странице.
     *
     * @return
     */
    @Step("Проверяем, что кнопка Корзина существует на странице.")
    public boolean isBasketButtonIsExist() {
        return waitVisibilityElement(BasketButton,30);
    }

}
