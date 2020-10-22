package Test2;

public class fractionTest {
    public static void main(String[] args) {
        fraction f1 = new fraction(2,10);
        fraction f2 = new fraction(1,3);
        System.out.println(f1.simplification());
        System.out.println(f1.addition(f2));
        System.out.println(f1.subtraction(f2));
        System.out.println(f1.multiplication(f2));
        System.out.println(f1.division(f2));
    }

}
