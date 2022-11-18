package JavaBasico;


public abstract class SmartDevice {
    protected boolean display;
    protected boolean bluetooth;
    protected String processor;
    protected String ram;
    protected String capacity;

    public SmartDevice(boolean display, boolean bluetooth, String processor, String ram, String capacity) {
        this.display = display;
        this.bluetooth = bluetooth;
        this.processor = processor;
        this.ram = ram;
        this.capacity = capacity;
    }

    public SmartDevice() {

    }

    public SmartDevice(boolean display, boolean bluetooth, String capacity) {
        this.display = display;
        this.bluetooth = bluetooth;
        this.capacity = capacity;
    }
}


