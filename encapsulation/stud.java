package OOP.encapsulation;
import java.util.*;

public class stud {
    public static void main(String[] args) {
        Scanner nkl = new Scanner(System.in);
        innerStudent obj = new innerStudent();
        obj.setdetails("Pintu", 204, 22);
        obj.getdetails();
    }
}
class innerStudent{
    private String name;
    private int roll_no;
    private int age;

    public void  getdetails(){
        System.out.println("Name is "+name);
        System.out.println("Roll No is "+roll_no);
        System.out.println("The age of the user is "+age);
    }
    public void setdetails(String name,int roll_no,int age ){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;

    }
}
