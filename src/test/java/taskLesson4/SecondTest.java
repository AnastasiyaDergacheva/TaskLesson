package taskLesson4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {
    String firsSubject = "Математика";
    String secondSubject = "Физика";
    String thirdSubject = "Биология";

    @Parameters({"one", "two", "three"})
    @Test
    public void startTest(String firsSubject, String secondSubject, String thirdSubject) {
        System.out.println("Первый предмет " + firsSubject);
        System.out.println("Второй предмет " + secondSubject);
        System.out.println("Третий предмет " + thirdSubject);
        System.out.println("Предметы для сдачи ЕГЭ: " + this.firsSubject + ", " + this.secondSubject + " и " + this.thirdSubject);

        this.firsSubject = firsSubject;
        this.secondSubject = secondSubject;
        this.thirdSubject = thirdSubject;
    }

    @Test(priority = 1)
    public void startTest2() {
        //тест с передачей параметров из другого класса
        ForConstructo con = new ForConstructo();
        System.out.println("Первый предмет " + firsSubject);
        System.out.println("Второй предмет " + secondSubject);
        System.out.println("Обязательные предметы для сдачи ЕГЭ: " + con.constParam1 + ", " + con.constParam2);

        this.firsSubject = firsSubject;
        this.secondSubject = secondSubject;
    }

}
