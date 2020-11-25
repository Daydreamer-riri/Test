package Test3;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee E1 = new Employee("E001", "ZhangSan", 25, "staff", "Personnel Department");
        Employee E2 = new Employee("E002", "LiSi", 30, "manage", "Finance Department");
        Employee E3 = new Employee("E003", "WangWu", 28, "engineer", "TechnologyTechnology Department");

        Scanner scanner = new Scanner(System.in);
        String Eid;
        do {
            Eid = scanner.next();
            if (Objects.equals(Eid, "E001")) {
                System.out.println(E1);
                E1.SignIn();
            } else if (Objects.equals(Eid, "E002")) {
                System.out.println(E2);
                E2.SignIn();
            } else if (Objects.equals(Eid, "E003")) {
                System.out.println(E3);
                E3.SignIn();
            }
            System.out.println("签到成功！");
            System.out.println();
        } while (Objects.equals(Eid, "E001") || Objects.equals(Eid, "E002") || Objects.equals(Eid, "E003"));
        System.out.println("出勤人数为" + Employee.getStaffAttendance());
    }
}
