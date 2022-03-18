package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObject extends Base {
    public InitPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//form//input[@placeholder='Искать на Ozon']")
    private WebElement searchText;

    @FindBy(xpath = ".//form//button[@class]")
    private WebElement submitSearch;

    /**
     * Вводим текст в строку поиска
     *
     * @param text
     * */
    public void setSearchText(String text) {
        setText(searchText, text);
    }

    /**
     * Выполняем поиск.
     *
     * */
    public void clickSubmitSearch() {
        click(submitSearch);
    }
}
