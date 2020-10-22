package Test1;

import java.util.Scanner;

import static java.lang.System.*;

public class T5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        float s = scanner.nextFloat();
        s = (int) s;
        out.print("请输入公里数：");
        if (s < 0) {
            out.print("您输入的公里数有误！请重新输入：");
            s = scanner.nextFloat();
            s = (int) s;
        }
        double cost;
        if (s < 2)
            cost = 5;
        else if (s < 9)
            cost = 5 + (((s - 2) + 1) * 1.3);
        else
            cost = 5 + ((s - 2) + 1) * 1.30 + ((s - 9) + 1) * 0.7;
        cost += 1;
        out.println(cost + "元");
    }
}
