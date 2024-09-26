package OOP.constructor;
public class student {
    public static void main(String[] args) {
        
        innerStudent obj = new innerStudent(10, "poojitha");
    }

}

class innerStudent{
    int id;
    String name;
    public innerStudent(int id,String roll,int age){
        System.out.println("Parameterized2");
    }
    public innerStudent(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Paramterized Constructor");
    }
   
}
