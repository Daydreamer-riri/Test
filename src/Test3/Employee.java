package Test3;

public class Employee {
    //定义成员变量
    private String EID;
    private String name;
    private int age;
    private String position;
    private String department;
    private boolean attendance = false;
    static private int staffAttendance;

    //构造方法
    public Employee(String EID, String name, int age, String position, String department) {
        this.EID = EID;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    //获取签到状态
    public boolean getAttendance(Employee employee) {
        return attendance;
    }

    @Override
    public String toString() {
        return "EID:" + EID + "\n" +
                "name:" + name + "\n" +
                "age:" + age + "\n" +
                "position:" + position + "\n" +
                "department:" + department + "\n";
    }

    //签到方法
    public void SignIn() {
        attendance = true;
        staffAttendance++;
    }

    //统计出勤人数
    static int getStaffAttendance() {
        return staffAttendance;
    }

}
