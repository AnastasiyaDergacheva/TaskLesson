package taskLesson4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void BeforeT(){
        System.out.println("Дейтвие перед началом теста");
    }

    @AfterTest
    public void AfterT(){
        System.out.println("Дейтвие после теста");
    }

    @BeforeMethod
    public void BeforeM(){
        System.out.println("Дейтвие перед началом метода");
    }

    @AfterMethod
    public void AfterM(){
        System.out.println("Дейтвие после метода");
    }

}
