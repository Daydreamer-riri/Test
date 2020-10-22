package Test2;

/**
 *测试Tv类
 * @author Daydreamer
 */
public class TVTest {
    public static void main(String[] args) {
        TV TV1;
        TV1 = new TV("LG","OLED88ZXPCA");
        TV1.printTV();
        TV1.turnOn();
        TV1.ChannelUp();
        System.out.println("频道加1");
        TV1.VolumeLevelDown();
        System.out.println("音量减1");
        TV1.printTV();
        TV1.setChannel(99);
        System.out.println("频道设为99");
        TV1.printTV();
        TV1.turnOff();
    }
}
