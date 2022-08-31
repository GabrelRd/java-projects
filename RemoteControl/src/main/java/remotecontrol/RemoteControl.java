/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrol;

public class RemoteControl implements Controler {
    private int deviceVolume;
    private boolean deviceOn;
    private boolean devicePlaying;
    public RemoteControl(){
        this.deviceVolume = 50;
        this.deviceOn = false;
        this.devicePlaying = false;
    }
    private void setDeviceVolume(int deviceVolume){
        this.deviceVolume = deviceVolume;
    }
    private int getDeviceVolume(){
        return this.deviceVolume;
    }

    private boolean isDeviceOn() {
        return deviceOn;
    }

    private void setDeviceOn(boolean deviceOn) {
        this.deviceOn = deviceOn;
    }

    private boolean isDevicePlaying() {
        return devicePlaying;
    }

    private void setDevicePlaying(boolean devicePlaying) {
        this.devicePlaying = devicePlaying;
    }

    @Override
    public void setOn() {
        this.setDeviceOn(true);
    }

    @Override
    public void setOff() {
        this.setDeviceOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("Dispositivo está ligado?"+this.isDeviceOn());
        System.out.print(this.getDeviceVolume());
            for (int i=0; i<this.getDeviceVolume();i+=10){
                System.out.print(" |");
            }
        System.out.println("\nDispositivo está tocando?"+this.isDevicePlaying());
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void upVolume() {
        if(this.isDeviceOn()){
            this.setDeviceVolume(this.getDeviceVolume() + 1);
        }
    }

    @Override
    public void downVolume() {
        if(this.isDeviceOn()){
            this.setDeviceVolume(this.getDeviceVolume() - 1);
        }
    }

    @Override
    public void mute() {
        if(this.isDeviceOn()&&this.getDeviceVolume()>0){
            this.setDeviceVolume(0);     
        }
    }

    @Override
    public void unmute() {
        if(this.isDeviceOn()&&this.getDeviceVolume()==0){
            this.setDeviceVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isDeviceOn()&& !this.isDevicePlaying()){
            this.setDevicePlaying(true);
        }
    }

    @Override
    public void pause() {
        if(this.isDeviceOn()&&this.isDevicePlaying()){
            this.setDevicePlaying(false);
        }
    }
    
    
}
