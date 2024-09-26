package OOP.inheritance;



public class hierarchial {
    public static void main(String[] args) {
        // System.out.println("HellPP"); 
        B obj = new B();
        C obj1 = new C();
        obj.show();
        obj1.show();

    }   
}
class A{
    void show(){
        System.out.println("HellP A");        
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("Help B");
    }
}
class C extends A{
    void show(){
        System.out.println("Help C");
    }
}   
