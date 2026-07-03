package Device;

public class Macbook extends Laptop {
    public void on(){
        System.out.println("Macbook is on");
    }
    public void off(){
        System.out.println("Macbook is off");
    }
    public void volumeUp(){
        volume++;
        System.out.println("Macbook volume up to " + volume);
    }
    public void volumeDown(){
        volume--;
        System.out.println("Macbook volume down to " + volume);
    }
    
}
