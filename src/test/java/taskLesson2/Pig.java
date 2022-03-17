package taskLesson2;

public class Pig extends Animals implements AnimalColor{
    public Pig(String name) {
        super(name);
    }

    public void say() {
        System.out.println("Xryyy");
    }

    @Override
    public void getColor() {
        System.out.println("pink");
    }
}
