// Diamond Problem
// Java does not support multiple inheritance with classes so this topic is ususally demonstrated using interface.
// Q1) A smart home system has deviceA and deviceB. both the system have same operation that is turnON. (Solution) Smartdevice implements both method/interfaces.

interface DeviceA_SIT{
default void turnON(){
    System.out.println("Device A is ON");
}
}
interface DeviceB_SIT{
default void turnON(){
    System.out.println("Device B is ON");
}
}

class SmartDevice implements DeviceA_SIT, DeviceB_SIT{
    public void turnON(){
        DeviceA_SIT.super.turnON();
        DeviceB_SIT.super.turnON();
    }
}

public class SIT_101{
    public static void main(String[] args){
        SmartDevice op = new SmartDevice();
        op.turnON();


    }
}

// encapsulation - data hiding