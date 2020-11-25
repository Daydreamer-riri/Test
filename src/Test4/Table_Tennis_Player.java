package Test4;

public class Table_Tennis_Player extends Athlete implements StudyEnglish {
    public Table_Tennis_Player(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    void training() {
        System.out.println("Training table tennis");
    }

    @Override
    void eat() {
        System.out.println("Eating a nutritious meal");
    }

    @Override
    public void spoken() {
        System.out.println("Learning spoken language");
    }
}

