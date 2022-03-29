package dbTest;

import db.DBHelp;
import org.testng.annotations.Test;

import java.util.Scanner;

public class DBTest {

    @Test
    public void startTest() {
        String sql = "SELECT * FROM REGISTRATION";
        DBHelp.getSqlResult(sql).forEach(s->System.out.println(s));


        String sql2 = "INSERT REGISTRATION(id, last, first, age) VALUES (20, 'lastname6', 'name6', 45)";
        System.out.println("Добавлено строк: " + DBHelp.getInsert(sql2));
    }

}
