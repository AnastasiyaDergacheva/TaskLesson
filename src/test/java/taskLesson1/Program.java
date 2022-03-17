package taskLesson1;

public class Program {
    public static void main(String[] args) {

        /*сравнение примитивных типов*/
        int i = 1, r = 54;
        boolean flag = true;
        long l = 3L;
        short s = 3;
        byte b = 2;
        char uni = '\u0066', asc = 102;

        boolean result = uni == asc;
        System.out.println("Сравнение char " + uni +  " short = " + asc + " - " + result);

        float piValue = (float) Math.PI;
        double piValueExt = Math.PI;
        boolean resultPI = piValue > piValueExt;
        System.out.println("Float значение: " + piValue + " и double значение: " + piValueExt + ". Значения равны - " + resultPI);


        System.out.println("--------");
        /*ветвление*/
        float f = 3.2f;
        if (f == 5.3f) {
            System.out.println("Данное число больше исходного");
        } else if (f == 2.22f) {
            System.out.println("Данное число меньше исходного");
        } else if (f == 3.2f) {
            System.out.println("Вы попали в точку");
        }

        System.out.println("--------");

        /*цикл с предусловием */
        double value = 0.125;
        while (value < 10.5) {
            value++;
            System.out.println(value);
        }

        System.out.println("--------");
        /*цикл со счетчиком*/
        float index = 5.0f;
        for (float x = 0.0f; x < index; x++) {
            System.out.println(x);
        }

        System.out.println("--------");
        /*цикл с постусловием*/
        int min = 45;
        do {
            System.out.println("До звонка осталось " + min + " минут.");
            min = min - 15;
        } while (min > 0);
    }

}
