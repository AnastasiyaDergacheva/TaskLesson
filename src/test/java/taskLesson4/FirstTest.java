package taskLesson4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FirstTest extends BaseTest{

        @DataProvider(name = "FlowerShop", parallel = true)
        public Object[][] getData() {
            Object[][] numberFlower = new Object[][]{
                    {"Роза", "90"},
                    {"Лилия", "40"},
                    {"Мимоза", "10"},
                    {"Герберы", "59"}
            };
            return numberFlower;
        }

        @Test(dataProvider = "FlowerShop")
        public void startTest(String flower, String quantity) {
            System.out.println("Название цветов - "  + flower + " кол-во: " + quantity);

            Assertion a = new Assertion();
            a.assertTrue(quantity.equalsIgnoreCase("90"), "заказаны ли цветы?");
        }
    }

