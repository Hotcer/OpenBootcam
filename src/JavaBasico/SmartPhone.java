package JavaBasico;

public class SmartPhone extends SmartDevice {

    boolean whatsaap;
    String cam;



    public SmartPhone(){
        super();
    }

    public SmartPhone(boolean whatsaap, String cam) {
        super();
        this.whatsaap = whatsaap;
        this.cam = cam;
    }

    public SmartPhone(boolean display, boolean bluetooth, String processor, String ram, String capacity, boolean whatsaap, String cam) {
        super(display, bluetooth, processor, ram, capacity);
        this.whatsaap = whatsaap;
        this.cam = cam;
    }
}

