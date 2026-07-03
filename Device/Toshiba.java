package Device;

public class Toshiba extends Laptop {
    public void on(){
        System.out.println("Toshiba is on");
    }
    public void off(){
        System.out.println("Toshiba is off");
    }
    public void volumeUp(){
        volume++;
        System.out.println("Toshiba volume up to " + volume);
    }
    public void volumeDown(){
        volume--;
        System.out.println("Toshiba volume down to " + volume);
    }
}
