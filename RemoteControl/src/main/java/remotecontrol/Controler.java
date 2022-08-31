
package remotecontrol;

public interface Controler {
    public abstract void setOn();
    public abstract void setOff();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void upVolume();
    public abstract void downVolume();
    public abstract void mute();
    public abstract void unmute();
    public abstract void play();
    public abstract void pause();
}
