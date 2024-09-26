package OOP.inheritance;
// Main must start or else we'll be getting error
public class inher {
    public static void main(String[] args) {
        car obj = new car();
        obj.brand="Corolla";
        obj.color="Grey Metal";
        obj.fueltype="Power Petrol";
        obj.sunroof=false;
        obj.mileage=18.9;
        obj.price=180000.98;
        obj.show();
    }
}
// Classes using from here
class vehicle{

    double price,mileage;
    String color;
    void show(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
class car extends vehicle{
    String fueltype,brand;
    boolean sunroof;
}
