package Test4;

public class Basketball_Coach extends Coach implements StudyEnglish {
    public Basketball_Coach(String name, int age) {
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
        System.out.println("Teaching basketball");
    }
}
