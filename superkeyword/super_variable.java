package OOP.superkeyword;

public class super_variable {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printcolor();
    }
}
class Animal{
    String color="Blackyy";
}
class Dog extends Animal{
    String color = "Lavender";
    void printcolor(){
        System.out.println(color+" This class");//prints the Existing class color
        System.out.println(super.color+" Parent class ");//prints color i.e. taken from the Parent variable
    }
}
