package Test1;

public class T6_2 {
    public static void main(String[] args) {
        System.out.println(1);
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                System.out.println(i);
            sum = 0;
        }
    }
}
