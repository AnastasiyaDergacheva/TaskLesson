package pageObject.google;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchGoodsPageObject extends Base {

    public SearchGoodsPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(.//div[@data-widget='megaPaginator']//div//button//span[contains(.,'В корзину')])[5]")
    private WebElement searchGoods;

    /**
     * Добавление товара в корзину.
     *
     * @return
     */
    @Step("Добавление товара в корзину.")
    public void clickSearchDelivery() {
        click(searchGoods);
    }

}
