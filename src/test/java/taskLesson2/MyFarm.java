package taskLesson2;

public class MyFarm {
    public static void main(String[] args) {
        Cat oli = new Cat("Oli");
        Fox fox1 = new Fox("Tom");
        Pig pig = new Pig("Puxlya");

        oli.eat();
        oli.say();

        fox1.eat();
        fox1.say();
        System.out.println(fox1.getName());
        fox1.setName("Gerald");
        fox1.getColor();

        pig.eat();
        pig.say();
        System.out.println(pig.getName());
        pig.getColor();
    }
}