package Test1;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        System.out.print("请输入年月：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day;
        while (month > 12 || month < 1) {
            System.out.print("输入年月不合规范！请重新输入：");
            year = scanner.nextInt();
            month = scanner.nextInt();
        }
        boolean flag;
        int[] A = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        flag = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (month == 2) {
            day = flag ? 29 : 28;
        } else
            day = A[month - 1];
        System.out.println(year + "年" + month + "月有" + day + "天。");
    }
}
