package Test1;

public class T6_1 {
    public static void main(String[] args) {
        long a = 1;
        double s = 0;
        System.out.println("以下为for循环");
        for (int i = 1; i <= 20; i++) {
            a *= i;
            s += 1.0 / a;
        }
        System.out.println(s);
        System.out.println("以下为do-while循环");
        a = 1;
        s = 0;
        int i = 1;
        do {
            a *= i;
            s += 1.0 / a;
            i++;
        } while (i <= 20);
        System.out.println(s);
    }
}
