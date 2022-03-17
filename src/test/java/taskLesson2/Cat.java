package taskLesson2;

public class Cat extends Animals implements AnimalColor {
    public Cat(String name) {
        super(name);
    }

    public void say() {
        System.out.println("Myu");
    }

    @Override /*перезаписываем реализацию метода из интерфецса анимал колор*/
    public void getColor() {
        System.out.println("black");
    }
}

