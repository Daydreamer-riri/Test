package Test1;
public class T6_3 {
    public static void main(String[] args) {
        int e = 9;
        while (e % 2 != 1 ||  e % 4 != 1 || e % 5 != 4 || e % 6 != 3 || e % 7 != 0 || e % 8 != 1
                || e % 9 != 0)
            e++;
        System.out.println(e);
    }
}
