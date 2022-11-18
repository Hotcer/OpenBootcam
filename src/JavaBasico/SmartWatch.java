package JavaBasico;

public class SmartWatch extends SmartDevice {
    boolean watchBand;
    boolean pulseMeter;
    boolean waterProof;

    public SmartWatch() {
    }

    public SmartWatch(boolean watchBand, boolean pulseMeter, boolean waterProof) {
        this.watchBand = watchBand;
        this.pulseMeter = pulseMeter;
        this.waterProof = waterProof;
    }

    public SmartWatch(boolean display, boolean bluetooth, String capacity, boolean watchBand, boolean pulseMeter, boolean waterProof) {
        super(display, bluetooth, capacity);
        this.watchBand = watchBand;
        this.pulseMeter = pulseMeter;
        this.waterProof = waterProof;
    }
}
