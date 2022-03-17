package taskLesson2;

public class Fox extends Animals implements AnimalColor{
    public Fox(String name) {
        super(name); /*обращение к имени класса родителя*/
    }

    public void say() {
        System.out.println("Fur");
    }

    @Override
    public void getColor() {
        System.out.println("Red");
    }
}