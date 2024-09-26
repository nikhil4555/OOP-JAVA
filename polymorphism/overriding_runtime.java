package OOP.polymorphism;

public class overriding_runtime {
    public static void main(String[] args) {
        // overiides and prints the child class Method in here
        Dinasour obj = new Dinasour();
        obj.structure();
    }
}
class Animal{
    void structure(){
        System.out.println("Its a massive Animal");
    }
}
class Dinasour extends Animal{  
    @Override
    void structure(){
        System.out.println("It's the Dinaosur Saalaar");
    }
}
class Mouse extends Animal{
    void structure(){
        System.out.println("Moouse is in here");
    }
}
