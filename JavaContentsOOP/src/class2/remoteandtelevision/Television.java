/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2.remoteandtelevision;

/**
 *
 * @author mauricio.moreira
 */
public class Television {
    public int channel;
    public int volume;
    public  Television() {
        this.channel = 0;
        this.volume = 0;
        System.out.println("TV started!");
    }
    public static void main(String[] args) {
        Television tv = new Television();
        Remote control = new Remote(tv.volume, tv.channel);
        
        control.showControlData();
        for (int i = 0; i < 10; i++) {
            control.increaseVolume();
            control.increaseChannel();
        }
        control.showControlData();
        control.changeChannel(35);
        control.showControlData();
    }  
}
