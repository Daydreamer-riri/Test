package Test2;

/**
 *定义一个电视机类，实现电视机的基本功能（换台，调整音量，开关）
 * @author Daydreamer
 *2020-10-22
 */

public class TV {
    int Channel = 1;
    int VolumeLevel = 10;
    int VolumeLevelMax = 30;
    boolean ON_Off = false;
    int Channels = 100;
    private String Brand;
    private String Model;

    public TV(String brand, String model, int volumeLevelMax, int channels) {
        VolumeLevelMax = volumeLevelMax;
        Channels = channels;
        Brand = brand;
        Model = model;
    }

    public TV(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public void turnOn(){ON_Off = true;}
    public void turnOff(){ON_Off = false;}
    public void VolumeLevelUp(){
        if (ON_Off&&VolumeLevel<30){
            VolumeLevel++;
        }
    }
    public void VolumeLevelDown(){
        if (ON_Off&&VolumeLevel>0){
            VolumeLevel--;
        }
    }
    public void setChannel(int newChannel){
        if (ON_Off) {
            if (newChannel < 1 || newChannel > Channels) {
                System.out.println("无此频道");
            } else {
                Channel = newChannel;
            }
        }
    }
    public void ChannelUp(){
        if (ON_Off) {
            if (Channel == 100) {
                Channel = 1;
            } else {
                Channel++;
            }
        }
    }
    public void ChannelDown(){
        if (ON_Off) {
            if (Channel == 1) {
                Channel = 100;
            } else {
                Channel--;
            }
        }
    }
    public void printTV(){
        System.out.println("Brand:"+Brand);
        System.out.println("Model:"+Model);
        System.out.print("ONOFF:");
        if (ON_Off) System.out.print("ON");
        else System.out.print("OFF");
        System.out.println();
        System.out.println("Channel:"+Channel);
        System.out.println("VolumeLevel:"+VolumeLevel);
        System.out.println();
    }

}
