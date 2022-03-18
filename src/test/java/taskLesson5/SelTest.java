package taskLesson5;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPageObject;
import pageObject.google.SearchElementPageObject;
import pageObject.google.SearchGoodsPageObject;

public class SelTest extends BaseTest {

    @Test
    public void startTest() {
        getDriver().get("https://www.ozon.ru/");
        getDriver().manage().window().maximize(); //развернет на весь экран

        InitPageObject in = new InitPageObject(getDriver());
        in.setSearchText("Кукла"); //текст для запроса
        in.clickSubmitSearch();     //клик для поиска

        SearchGoodsPageObject sg = new SearchGoodsPageObject(getDriver());
        sg.clickSearchDelivery();

        SearchElementPageObject se = new SearchElementPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertFalse(se.isBasketButtonIsExist(), "Кнопка <Корзина> присутствует на странице?");
    }
}