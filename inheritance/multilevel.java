package OOP.inheritance;

public class multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
class A{
    void showA(){
        System.out.println("A method");
    }
}

class B extends A{
    void showB(){
        System.out.println("B method");
    }
}
class C extends B{
    void showC(){
        System.out.println("C method");
    }
}