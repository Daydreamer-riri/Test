package Test4;

public abstract class People {
    String name;
    int age;

    abstract void eat();

    void sleep() {
        System.out.println("Everyone needs sleep.");
    }
}
