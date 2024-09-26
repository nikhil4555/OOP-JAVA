package OOP.superkeyword;

public class super_method {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.exhaust();
    }
}
class vehicle{
    public void exhaust(){
        System.out.println("Sounds Like a beast");
    }
}
class Bike extends vehicle{ 
    public void exhaust(){
        super.exhaust();
        System.out.println("v10-Twin urbo Engine ka sound");
    }
}
