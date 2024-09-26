package OOP.abstraction;

public class abstt {
    public static void main(String[] args) {
       innerclass obj = new vehicles(); 
       obj.engine();
       obj.run();
    }
}
abstract class innerclass{
    abstract public void run();
    public void engine(){
        System.out.println("Its V8 Twin Turbo Egine Powerful");
    }
}
class vehicles extends innerclass{
    public void run(){
        System.out.println("Runs Over speed");
    }
}
