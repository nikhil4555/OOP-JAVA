package OOP.polymorphism;

public class overloading_compile {
    public static void main(String[] args) {
        System.out.println(Linkfields.sum(12,15));
        System.out.println(Linkfields.sum(15,14,18));
    }
}
class Linkfields{
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
