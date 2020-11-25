package Test4;

public class Table_Tennis_Coach extends Coach implements StudyEnglish {
    public Table_Tennis_Coach(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Eating a nutritious meal");
    }

    @Override
    public void spoken() {
        System.out.println("Learning spoken language");
    }

    @Override
    void teaching() {
        System.out.println("Teaching table tennis");
    }
}
