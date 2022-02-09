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
public class Remote {
    int volume;
    int channel;
    public Remote(int volume, int channel) {
        this.volume = volume;
        this.channel = channel;
    }
    public int increaseVolume() {
        return this.volume++;
    }
    public int decreaseVolume() {
        return this.volume--;
    }
    public int increaseChannel() {
        return this.channel++;
    }
    public int decreaseChannel() {
        return this.channel--;
    }
    public void changeChannel(int newChannel) {
        this.channel = newChannel;
    }
    public void showControlData() {
        System.out.println("Channel: " + this.channel);
        System.out.println("Volume: " + this.volume);
    }
}
