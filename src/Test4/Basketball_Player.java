package Test4;

public class Basketball_Player extends Athlete implements StudyEnglish{
    public Basketball_Player(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    void training() {
        System.out.println("Training basketball");
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
