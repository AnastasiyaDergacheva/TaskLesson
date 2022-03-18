package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchElementPageObject extends Base {

    public SearchElementPageObject(WebDriver driver) {
        super(driver);
    }


    // .//div[@id='stickyHeader']//div[@class='gc3']//a[contains(.,'Корзина')]
    @FindBy(xpath = "*[@id=\"stickyHeader\"]/div[4]/a[2]")
    private WebElement BasketButton;

    /**
     * Проверяем, что кнопка Корзина существует на странице.
     *
     * @return
     */
    public boolean isBasketButtonIsExist() {
        return waitVisibilityElement(BasketButton);
    }

}
