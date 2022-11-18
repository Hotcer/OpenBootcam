package JavaBasico;

public class Main {


    public static void main(String[] args) {

        SmartPhone samsungS21;
        samsungS21 = new SmartPhone(true,true,"octa-core","8GB","128Gb",true,"16mpx");
        System.out.println(samsungS21);
        SmartWatch huaweiFit = new SmartWatch(true, true,"4GB",true,true,true);
        System.out.println(huaweiFit);
    }
}
