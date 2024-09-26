package OOP.accessmodifoer;

public class student {
    public static void main(String[] args) {
     System.out.println("/*                         |Public Private Protected Default*/");   
     System.out.println("Same-Class                 |    🟢     🟢      🟢        🟢");
     System.out.println("Same-Package With Subclass |    🟢     🔴      🟢        🟢");
     System.out.println("Same-Package No-Subclass   |    🟢     🔴      🟢        🟢");
     System.out.println("Diff-Package With Subclass |    🟢     🔴      🟢        🔴");
     System.out.println("Diff-Package No-Subclass   |    🟢     🔴      🔴        🔴");
    }
}
class innerStudent{
    String Name;
    int id;
    public innerStudent(int id,String Name){
        this.id=id;
        this.Name=Name;
    }
}
