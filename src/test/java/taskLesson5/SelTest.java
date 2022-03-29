package taskLesson5;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPageObject;
import pageObject.google.SearchElementPageObject;
import pageObject.google.SearchGoodsPageObject;

import java.io.File;
import java.io.IOException;

public class SelTest extends BaseTest {

    @Test
    @Epic("Селениум")
    @Feature("Тест на сайте ozon")
    @Story("Проверка поиска товара")
    public void startTest() {
        //com.logToReport("ссылка на стенд: https://www.ozon.ru/");
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

        //получение скриншота
        File file = new File("./src/main/resources/name.jpg");
        try {
            FileUtils.writeByteArrayToFile(file, getScreenShot());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
