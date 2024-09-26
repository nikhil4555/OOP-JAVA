package OOP.superkeyword;

public class super_constructor {
    public static void main(String[] args) {
        chetah obj = new chetah();
        
    }
}
class Animal{
    public Animal(int id){
        System.out.println("Animal class");
    }
}
class chetah extends Animal{
    public chetah(){
        super(55);
        System.out.println("Chetah Class");
    }
}