package OOP.interafce;

import java.net.CacheRequest;

public class carinterface {
    public static void main(String[] args) {
       Car obj = new Ev();
       Car obj1 = new Sportd();
       obj.start();
       obj1.start(); 
    }
}

interface Car{
    public void start();
}
class Ev implements Car{
    public void start(){
        System.out.println("Stares vromm vromm");
    }
}
class Sportd implements Car{
    public void start(){
        System.out.println("Tesla Cant beat it");
    }
}